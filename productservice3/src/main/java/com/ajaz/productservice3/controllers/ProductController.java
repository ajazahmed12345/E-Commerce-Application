package com.ajaz.productservice3.controllers;

import com.ajaz.productservice3.dtos.GenericProductDto;
import com.ajaz.productservice3.exceptions.NotFoundException;
import com.ajaz.productservice3.models.Product;
import com.ajaz.productservice3.security.JwtObject;
import com.ajaz.productservice3.security.TokenValidator;
import com.ajaz.productservice3.services.ProductService;
import jakarta.annotation.Nullable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private TokenValidator tokenValidator;

    public ProductController(ProductService productService, TokenValidator tokenValidator){
        this.productService = productService;
        this.tokenValidator = tokenValidator;
    }

    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id) throws NotFoundException {

//        System.out.println(authToken);
//
//        Optional<JwtObject> jwtObjectOptional = tokenValidator.validateToken(authToken);
//
//        JwtObject authTokenObj = null;
//
//        if(authToken != null) {
//            if (jwtObjectOptional.isEmpty()) {
//                // throw exception or return 401
//                return null;
//            }
//
//            authTokenObj = jwtObjectOptional.get();
//        }
//
//        Long userIdTryingToAccess = authTokenObj.getUserId();


        GenericProductDto genericProductDto = productService.getProductById(id);

        if(genericProductDto == null){
            throw new NotFoundException("product does not exist.");
        }

        return genericProductDto;
    }

    @GetMapping()
    public ResponseEntity<List<GenericProductDto>> getAllProducts(){
        List<GenericProductDto> genericProductDtos = productService.getAllProducts();
        if(genericProductDtos.isEmpty()){
            return new ResponseEntity<>(genericProductDtos, HttpStatus.NOT_FOUND);
        }


        return new ResponseEntity<>(genericProductDtos, HttpStatus.OK);
    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product){
        return productService.createProduct(product);
    }

    public void updateProductById(){

    }

    public void deleteProductById(){

    }
}
