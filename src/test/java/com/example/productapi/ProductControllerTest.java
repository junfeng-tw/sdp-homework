package com.example.productapi;

import com.example.productapi.controller.ProductController;
import com.example.productapi.model.Product;
import com.example.productapi.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    void testGetProducts() throws Exception {
        Pageable pageable = PageRequest.of(0, 15);
        Page<Product> productPage = new PageImpl<>(Collections.emptyList(), pageable, 0);
        when(productService.getProducts(1, 15)).thenReturn(productPage);

        mockMvc.perform(get("/api/products")
                        .param("page", "1")
                        .param("size", "15"))
                .andExpect(status().isOk());
    }
}
