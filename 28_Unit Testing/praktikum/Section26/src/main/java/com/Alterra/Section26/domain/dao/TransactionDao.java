package com.Alterra.Section26.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transaction")
public class TransactionDao {
    @Id
    private String id;
    private String customer_name;
    private String transaction_details;
    private String is_paid;
    private String created_at;
}
