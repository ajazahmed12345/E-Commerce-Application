package com.ajaz.productservice3.services;

import com.ajaz.productservice3.dtos.FakeStoreProductDto;
import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.exceptions.NotFoundException;
import com.ajaz.productservice3.models.Product;
import com.ajaz.productservice3.thirdPartyClients.FakeStoreProductServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@Primary
public class FakeStoreProductService implements ProductService{

    private FakeStoreProductServiceClient fakeStoreProductServiceClient;

    public FakeStoreProductService(FakeStoreProductServiceClient fakeStoreProductServiceClient){
        this.fakeStoreProductServiceClient = fakeStoreProductServiceClient;
    }
    @Override
    public GenericProductDto getProductById(Long id) throws NotFoundException {

        System.out.println("In product service now");

       return convertFakeStoreProductDtoToProduct(fakeStoreProductServiceClient.getProductById(id));
    }


    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
       return convertFakeStoreProductDtoToProduct(fakeStoreProductServiceClient.createProduct(product));

    }

    public List<GenericProductDto> getAllProducts(){

        List<FakeStoreProductDto> response = fakeStoreProductServiceClient.getAllProducts();
        List<GenericProductDto> products = response.stream().map(
                e -> convertFakeStoreProductDtoToProduct(e)
        ).collect(Collectors.toList());

        return products;

    }

    private GenericProductDto convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto){
        GenericProductDto product = new GenericProductDto();

        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setCategory(fakeStoreProductDto.getCategory());
        product.setImage(fakeStoreProductDto.getImage());
        product.setPrice(fakeStoreProductDto.getPrice());

        return product;

    }

    @Override
    public Page<Product> findAllByTitleContaining(String title, Pageable pageable) {
        return null;
    }
}
