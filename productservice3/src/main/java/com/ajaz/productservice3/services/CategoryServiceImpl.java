package com.ajaz.productservice3.services;

import com.ajaz.productservice3.models.Category;
import com.ajaz.productservice3.models.Product;
import com.ajaz.productservice3.repositories.CategoryRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Primary
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @Override
    public List<Product> getProductsById(String uuuid) {
        return null;
    }

    @Override
    public List<String> getProductTitles(List<String> categoryUuids) {

        List<UUID> uuids = new ArrayList<>();

        for(String uuid : categoryUuids){
            uuids.add(UUID.fromString(uuid));
        }

        List<Category> categories = categoryRepository.findAllByIdIn(uuids);


        List<String> titles = new ArrayList<>();

        categories.forEach(
                category -> {
                    category.getProducts().forEach(
                      product -> titles.add(product.getTitle())
                    );
                }
        );

        return titles;


    }
}
