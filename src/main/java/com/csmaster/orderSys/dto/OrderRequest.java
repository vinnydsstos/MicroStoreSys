package com.csmaster.orderSys.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.csmaster.orderSys.model.Address;
import com.csmaster.orderSys.model.Client;
import com.csmaster.orderSys.model.Order;
import com.csmaster.orderSys.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderRequest {

	private Integer idOrder;
	private ClientRequest clientRequest;
	private Integer idProduct;
	private AddressRequest address;

}
