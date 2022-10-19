package com.csmaster.orderSys.dto;

import lombok.Data;

@Data
public class AddressRequest {

    private Integer id;
    private String street;
    private Integer stablishmentNumber;
    private String neighborhood;
    private String complement;
    private String zipCode;

}
