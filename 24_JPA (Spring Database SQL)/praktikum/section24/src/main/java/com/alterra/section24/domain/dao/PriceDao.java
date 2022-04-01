package com.alterra.section24.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "price")
public class PriceDao extends BaseDao{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "jumlah_stock")
    private Integer jumlahStock;

    @Column(name = "price")
    private Integer price;


}
