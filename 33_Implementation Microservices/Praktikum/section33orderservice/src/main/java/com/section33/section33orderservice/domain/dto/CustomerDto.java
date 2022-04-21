package com.section33.section33orderservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDto {
    private Long id;
    private String customer_name;
    private String gender;
    private String nomor_hp;
    private String alamat;
    private Integer kodepos;
//    @Serial
//    private static final long serialVersionUID = 4039125276797294994L;
//    @Serial
//    private static final long serialVersionUID = 4039125276797294994L;
}
