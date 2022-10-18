package com.csmaster.orderSys.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduct;
	private String productName;
	private Double productValue;

	public Product() {
		super();
	}

	public Product(Integer idProduct) {
		super();
		this.idProduct = idProduct;
	}

	public Product(Integer idProduct, String productName, Double productValue) {
		super();
		this.idProduct = idProduct;
		this.productName = productName;
		this.productValue = productValue;
	}

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductValue() {
		return productValue;
	}

	public void setProductValue(Double productValue) {
		this.productValue = productValue;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", productName=" + productName + ", productValue=" + productValue
				+ "]";
	}
	
	

}
