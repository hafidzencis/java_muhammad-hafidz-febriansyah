package com.Alterra.Section26.domain.dto;


import com.Alterra.Section26.domain.dao.ProductDao;
import com.Alterra.Section26.domain.dao.TransactionDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDetailDto {
    private String id;

    private TransactionDto transaction_id;

    private ProductDto product_id;

    private Long quantity;
}
