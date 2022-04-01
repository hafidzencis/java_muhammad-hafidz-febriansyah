package com.example.Alterra.domain.dto;

import com.example.Alterra.domain.dao.BrandsDao;
import com.example.Alterra.domain.dao.CategoriesDao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)


public class ProductsDto {

    private Long id;
    private String productName;
    private CategoriesDto categoryDao;
    private BrandsDto brandDao;
    private Integer modelYear;
    private Integer listPrice;
}
