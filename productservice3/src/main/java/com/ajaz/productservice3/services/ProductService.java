package com.ajaz.productservice3.services;

import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.exceptions.NotFoundException;
import com.ajaz.productservice3.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    GenericProductDto getProductById(Long id) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto product);

    List<GenericProductDto> getAllProducts();

    Page<Product> findAllByTitleContaining(String title, Pageable pageable);


}
