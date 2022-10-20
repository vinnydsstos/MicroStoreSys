package com.csmaster.orderSys.dto;

import lombok.Data;

@Data
public class ProductRequest {

    private Integer id;
    private String productName;
    private Double productValue;

}
