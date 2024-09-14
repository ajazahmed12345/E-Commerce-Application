package com.ajaz.productservice3.services;

import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.exceptions.NotFoundException;
import com.ajaz.productservice3.models.Product;
import com.ajaz.productservice3.repositories.ProductElasticSearchRepository;
import com.ajaz.productservice3.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class SelfProductServiceImpl implements ProductService{

    private ProductRepository productRepository;
    private ProductElasticSearchRepository productElasticSearchRepository;

    public SelfProductServiceImpl(ProductRepository productRepository, ProductElasticSearchRepository productElasticSearchRepository){
        this.productRepository = productRepository;
        this.productElasticSearchRepository = productElasticSearchRepository;
    }


    @Override
    public GenericProductDto getProductById(Long id) throws NotFoundException {

        // Product product = productRepository.findById(id);

//        if(product.getStatus().equals(PRIVATE)) {
//            if (product.getCreatorId().equals(userIdTryingToAccess)) {
//                return product;
//            }
//
//            return null;
//        }
//
//        return product;




        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {

        Product product1 = new Product();

        product1.setTitle(product.getTitle());
        product1.setDescription(product.getDescription());

        Product savedProduct = productRepository.save(product1);

//        productElasticSearchRepository.save(savedProduct);

        return null;
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        return null;
    }

    @Override
    public Page<Product> findAllByTitleContaining(String title, Pageable pageable) {
        return null;
    }
}
