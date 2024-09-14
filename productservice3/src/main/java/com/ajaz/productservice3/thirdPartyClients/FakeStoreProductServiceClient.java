package com.ajaz.productservice3.thirdPartyClients;

import com.ajaz.productservice3.dtos.FakeStoreProductDto;
import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class FakeStoreProductServiceClient{

    RestTemplateBuilder restTemplateBuilder;

    Logger log = LoggerFactory.getLogger(this.getClass());

//    private String requestUrl = "https://fakestoreapi.com/products/{id}";

//    @Value("${fakestore.api.url}")

    @Value("${fakestore.api.url}")
    private String fakeStoreUrl;

//    @Value("${fakestore.products.url}")

    @Value("${fakestore.products.url}")
    private String productsUrl = null;
    private String requestUrl = null;

    private String productRequestsBaseUrl = null;

    public FakeStoreProductServiceClient(RestTemplateBuilder restTemplateBuilder,
                                         @Value("${fakestore.api.url}") String fakeStoreUrl,
                                         @Value("${fakestore.products.url}") String productsUrl){
        this.restTemplateBuilder = restTemplateBuilder;
        this.requestUrl = fakeStoreUrl + productsUrl + "/{id}";
        this.productRequestsBaseUrl = fakeStoreUrl + productsUrl;
    }

    public FakeStoreProductDto getProductById(Long id) throws NotFoundException {

        log.info("getting product by id " + id);

        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto> response = restTemplate.getForEntity(requestUrl, FakeStoreProductDto.class, id);

        FakeStoreProductDto fakeStoreProductDto = response.getBody();

        if(fakeStoreProductDto == null){
            throw new NotFoundException("product with id = " + id + " does not exist");
//            return null;
        }


        return fakeStoreProductDto;
    }



    public FakeStoreProductDto createProduct(GenericProductDto product) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto> response = restTemplate.postForEntity(productRequestsBaseUrl, product, FakeStoreProductDto.class);

        return response.getBody();

    }

    public List<FakeStoreProductDto> getAllProducts(){
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto[]> response = restTemplate.getForEntity(productRequestsBaseUrl, FakeStoreProductDto[].class);

        List<FakeStoreProductDto> products = new ArrayList<>();

        for(FakeStoreProductDto p : response.getBody()){
            products.add(p);
        }

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
}
