package com.example.Alterra.domain.dto.response;


import com.example.Alterra.domain.dto.ProductsDto;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaginationProductsResponse {
    private List<ProductsDto> products;
    private int size;
    private int page;
    private int totalPage;
}
