package com.csmaster.orderSys.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idClient;
	private String clientName;
	
	@JsonIgnore
	@OneToMany(targetEntity = Order.class, cascade = CascadeType.ALL, mappedBy = "client")
	private List<Order> orders;
	
	
	

	public Client() {
	}
	
	
	
	

	public Client(Integer idClient) {
		super();
		this.idClient = idClient;
	}





	public Client(Integer idClient, String clientName, List<Order> orders) {
		super();
		this.idClient = idClient;
		this.clientName = clientName;
		this.orders = orders;
	}




	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", clientName=" + clientName + ", orders=" + orders + "]";
	}
	
	
	
	
}
