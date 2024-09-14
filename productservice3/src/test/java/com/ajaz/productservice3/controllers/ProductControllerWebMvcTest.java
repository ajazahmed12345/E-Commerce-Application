package com.ajaz.productservice3.controllers;
//
//import com.ajaz.productservice3.dtos.GenericProductDto;
//import com.ajaz.productservice3.services.ProductService;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.ArrayList;
//
//import static org.hamcrest.Matchers.is;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
////import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.header;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//@WebMvcTest(ProductController.class)
public class ProductControllerWebMvcTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ProductService productService;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Test
//    void getAllProductsReturnsEmptyListWhenNoProducts() throws Exception {
//
//        when(productService.getAllProducts()).thenReturn(new ArrayList<>());
//
//        mockMvc.perform(get("/products"))
//                .andExpect(status().is(404))
//                .andExpect(content().string("[]"));
//
//
//
//    }
//
//    @Test
//    void returnsListOfProductsWhenProductsExist() throws Exception {
//        ArrayList<GenericProductDto> products = new ArrayList<>();
//
//
//        products.add(new GenericProductDto());
//        products.add(new GenericProductDto());
//        products.add(new GenericProductDto());
//
//        when(productService.getAllProducts()).thenReturn(products);
//
//        mockMvc.perform(get("/products"))
//                .andExpect(status().is(200))
//                .andExpect(content().string(objectMapper.writeValueAsString(products)))
//        ;
//
//
//    }
//
//    @Test
//    void createProductShouldCreateNewProduct() throws Exception {
//
//        GenericProductDto productDto = new GenericProductDto();
//        productDto.setTitle("i phone");
//        productDto.setImage("some image");
//        productDto.setCategory("mobile phones");
//        productDto.setDescription("Best ever i phone");
//
//        GenericProductDto expectedProduct = new GenericProductDto();
//        expectedProduct.setId(1001L);
//        expectedProduct.setTitle("i phone");
//        expectedProduct.setImage("some image");
//        expectedProduct.setCategory("mobile phones");
//        expectedProduct.setDescription("Best ever i phone");
//
//        when(productService.createProduct(any())).thenReturn(expectedProduct);
//
//        mockMvc.perform(post("/products")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(productDto)))
//                .andExpect(status().is(200))
//                .andExpect(
//                  content().string(objectMapper.writeValueAsString(expectedProduct))
//                )
//                .andExpect(jsonPath("$.student.name", is("Ajaz")))
//                .andExpect(jsonPath("$.length()", is(2)));
//    }
//
//
//
}
