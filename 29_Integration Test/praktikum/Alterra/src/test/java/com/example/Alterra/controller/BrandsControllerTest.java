package com.example.Alterra.controller;


import com.example.Alterra.repository.BrandsRepository;
import com.example.Alterra.repository.CategoriesRepository;
import com.example.Alterra.repository.ProductsRepository;
import com.example.Alterra.repository.StocksRepository;
import com.example.Alterra.service.BrandsService;
import com.example.Alterra.service.CategoriesService;
import com.example.Alterra.service.ProductsService;
import com.example.Alterra.service.StocksService;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class BrandsControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductsRepository productsRepository;

    @MockBean
    private BrandsRepository brandsRepository;

    @MockBean
    private CategoriesRepository  categoriesRepository;

    @MockBean
    private StocksRepository stocksRepository;

    @MockBean
    private ProductsService productsService;

    @MockBean
    private ProductsController productsController;

    @MockBean
    private CategoriesService categoriesService;

    @MockBean
    private CategoriesController categoriesController;

    @MockBean
    private BrandsService brandsService;

    @MockBean
    private BrandsController brandsController;

    @MockBean
    private StocksService stocksService;

    @MockBean
    private StocksController stocksController;

    @Test
    public void createBrands() throws Exception {
        JSONObject payload = new JSONObject();
        payload.put("brandName","legendary");

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/v1/categories")
                .content(payload.toString())
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc
                .perform(requestBuilder)
                .andReturn();

        assertEquals(HttpStatus.OK.value(), response.getResponse().getStatus());
    }



}