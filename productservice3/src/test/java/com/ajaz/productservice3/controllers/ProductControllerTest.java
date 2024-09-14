package com.ajaz.productservice3.controllers;
//
//import com.ajaz.productservice3.dtos.GenericProductDto;
//import com.ajaz.productservice3.exceptions.NotFoundException;
//import com.ajaz.productservice3.services.FakeStoreProductService;
//import com.ajaz.productservice3.services.ProductService;
//import com.ajaz.productservice3.thirdPartyClients.FakeStoreProductServiceClient;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentCaptor;
//import org.mockito.Captor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
public class ProductControllerTest {
//
//    @MockBean
//    @Autowired
//    private FakeStoreProductServiceClient fakeStoreProductServiceClient;
//
//    @MockBean
//    @Autowired
//    private FakeStoreProductService fakeStoreProductService;
//
//    @Autowired
//    private ProductController productController;
//
//    @MockBean
//    private ProductService productService;
//
//    @Captor
//    private ArgumentCaptor<Long> idCaptor;
//
//    @Captor
//    private ArgumentCaptor<Long> fakeStoreCaptor;
//
//    @Test
//    @DisplayName("1 + 1 == 2")
//    void test1Plus1Equals2(){
//        assert(1+1 == 20);
//    }
//
//    @Test
//    @DisplayName("testing fakeStore exception")
//    void testFakeStoreProductService() throws NotFoundException {
////        assertNull(fakeStoreProductServiceClient.getProductById(101L));
//
//        assertThrows(RuntimeException.class, () -> fakeStoreProductServiceClient.getProductById(101L));
//
//    }
//
//    @Test
//    void testReturnsNullWhenProductDoesntExist() throws NotFoundException{
//        GenericProductDto genericProductDto = productController.getProductById(121L);
//
//        when(productService.getProductById(any(Long.class)))
//                .thenReturn(null);
//
//        assertNull(genericProductDto);
//
//
//    }
//
//    @Test
//    void shouldReturntitleAjazWithProductId1() throws NotFoundException{
//        GenericProductDto genericProductDto = new GenericProductDto();
//        genericProductDto.setTitle("Ajaz");
//
//        when(productService.getProductById(1L))
//                .thenReturn(
//                        genericProductDto
//                );
//
//        GenericProductDto genericProductDto1 = productController.getProductById(1L);
//
//        assertEquals("Aja", genericProductDto1.getTitle());
//
//    }
//
//    @Test
//    void testThrowsExceptionWhenProductDoesNotExist() throws NotFoundException{
//        when(
//                productService.getProductById(any(long.class))
//        ).thenReturn(null);
//
//        assertThrows(NotFoundException.class, () -> productController.getProductById(123L));
//
//
//    }
//
//    @Test
//    void returnSameProductAsServiceWhenProductExists() throws NotFoundException{
//        GenericProductDto genericProductDto = new GenericProductDto();
//
//        when(
//                productService.getProductById(any(Long.class))
//        ).thenReturn(genericProductDto);
//
//        assertEquals(genericProductDto, productController.getProductById(123L));
//
//
//    }
//
//    @Test
//    void productControllerCallsProductServiceWithSameProductId() throws NotFoundException {
//        Long id = 1L;
//
//        when(productService.getProductById(any()))
//                .thenCallRealMethod();
//
//        when(fakeStoreProductServiceClient.getProductById(any()))
//                .thenCallRealMethod();
//
//
//        //
//
//
//        productController.getProductById(id);
//
//        verify(productService).getProductById(idCaptor.capture());
//        verify(fakeStoreProductServiceClient).getProductById(fakeStoreCaptor.capture());
//
//        assertEquals(id, idCaptor.getValue());
//
//        assertEquals(id, fakeStoreCaptor.getValue());
//
//
//    }
//
//
//
//
}
