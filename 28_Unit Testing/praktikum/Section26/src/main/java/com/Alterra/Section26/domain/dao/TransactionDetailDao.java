package com.Alterra.Section26.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transactiondetail")
public class TransactionDetailDao {
    @Id
    private String id;

    private String transaction_id;

    private String product_id;

    private Long quantity;
}
