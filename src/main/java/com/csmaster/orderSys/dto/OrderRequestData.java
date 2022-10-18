package com.csmaster.orderSys.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.csmaster.orderSys.model.Address;
import com.csmaster.orderSys.model.Client;
import com.csmaster.orderSys.model.Order;
import com.csmaster.orderSys.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderRequestData {

	@JsonProperty("idClient")
	private int idClient;
	@JsonProperty("idProduct")
	private Integer[] idProduct;
	@JsonProperty("address")
	private Address address;

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public Integer[] getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer[] idProduct) {
		this.idProduct = idProduct;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Order toOrder() {
		Order o = new Order();
		o.setClient(new Client(this.idClient));
		
		List<Product> products = new ArrayList<Product>();
		for (Integer i : this.getIdProduct()) {
			products.add(new Product(i));
		}
		
		o.setProducts(products);
		
		o.setAddress(this.address);
		return o;
	}

	@Override
	public String toString() {
		return "OrderRequestData [idClient=" + idClient + ", idProduct=" + Arrays.toString(idProduct) + ", address="
				+ address + "]";
	}
	
	

}
