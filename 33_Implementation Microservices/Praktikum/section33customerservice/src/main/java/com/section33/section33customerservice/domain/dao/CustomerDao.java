package com.section33.section33customerservice.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerDao  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name",nullable = false)
    private String customer_name;

    @Column(name = "gender",nullable = false)
    private String gender;

    @Column(name = "nomor_hp",nullable = false)
    private String nomor_hp;

    @Column(name = "alamat",nullable = false)
    private String alamat;

    @Column(name = "kodepos",nullable = false)
    private Integer kodepos;
}
