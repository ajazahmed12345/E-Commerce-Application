package com.ajaz.productservice3.services;

import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.dtos.SortParameters;
import com.ajaz.productservice3.models.Product;
import com.ajaz.productservice3.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    private ProductRepository productRepository;

    public SearchService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public Page<GenericProductDto> getAllProducts(String query, int pageNumber, int sizeOfEachPage, List<SortParameters> sortParameters){

        Sort sort = Sort.by(sortParameters.get(0).getParameterName()).descending();

        int n = sortParameters.size();
        for(int i=1; i < n; i++){
            if(sortParameters.get(i).getSortType().equals("ASC")){
                sort = sort.and(
                  Sort.by(sortParameters.get(i).getParameterName())
                );
            }
            else{
                sort = sort.and(Sort.by(sortParameters.get(i).getParameterName()).descending());
            }
        }

        PageRequest pageRequest = PageRequest.of(pageNumber, sizeOfEachPage, sort);


        Page<Product> productPage = productRepository.findAllByTitleContaining(query, pageRequest);

        List<Product> productsList = productPage.get().collect(Collectors.toList());

        List<GenericProductDto> genericProductDtos = new ArrayList<>();

        for(Product product : productsList){
            genericProductDtos.add(GenericProductDto.from(product));
        }

        Page<GenericProductDto> ans = new PageImpl<>(
                genericProductDtos, productPage.getPageable(), productPage.getTotalElements()
        );

        return ans;


    }
}
