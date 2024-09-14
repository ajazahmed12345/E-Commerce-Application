package com.ajaz.productservice3.thirdPartyClients;

import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.exceptions.NotFoundException;

import java.util.List;

public interface ThirdPartyProductServiceClient {
    GenericProductDto getProductById(Long id) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto product);

    List<GenericProductDto> getAllProducts();
}
