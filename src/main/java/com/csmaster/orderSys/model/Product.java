package com.csmaster.orderSys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT")
public class Product {

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "SEQ_PRODUCT", sequenceName = "SEQ_PRODUCT", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_PRODUCT")
	private Integer idProduct;

	@Column(name = "NAME")
	private String productName;

	@Column(name = "VALUE")
	private Double productValue;

	public Product(Integer id) {
		this.idProduct = id;
	}
}
