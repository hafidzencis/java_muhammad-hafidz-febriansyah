package com.example.Alterra.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@SQLDelete(sql = "UPDATE products SET deleted_at = CURRENT_TIMESTAMP WHERE id = ?")
@Where(clause = "deleted_at IS NULL")
public class ProductsDao extends  BaseDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @ManyToOne
    private CategoriesDao categoryDao;

    @ManyToOne
    private BrandsDao brandDao;

    @Column(name = "model_year")
    private Integer modelYear;

    @Column(name = "list_price")
    private Integer listPrice;
}
