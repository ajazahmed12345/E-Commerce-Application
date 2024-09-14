package com.ajaz.productservice3.services;

import com.ajaz.productservice3.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface CategoryService {
    List<Product> getProductsById(String uuuid);

    List<String> getProductTitles(List<String> uuids);


}
