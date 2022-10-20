package com.csmaster.orderSys.dto;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.csmaster.orderSys.model.Order;
import com.csmaster.orderSys.model.Product;

import lombok.Data;

@Data
public class OrderRequest {
	private Integer idOrder;
	private ClientRequest client;
	private List<ProductRequest> products;
	private AddressRequest address;

}
