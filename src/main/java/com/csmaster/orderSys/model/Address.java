package com.csmaster.orderSys.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAddress;
	private String street;
	private Integer stablishmentNumber;
	private String neighborhood;
	private String complement;
	private String zipCode;
	
	@OneToOne(mappedBy = "address")
	private Order order;

	public Integer getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(Integer idAddress) {
		this.idAddress = idAddress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getStablishmentNumber() {
		return stablishmentNumber;
	}

	public void setStablishmentNumber(Integer stablishmentNumber) {
		this.stablishmentNumber = stablishmentNumber;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [idAddress=" + idAddress + ", street=" + street + ", stablishmentNumber=" + stablishmentNumber
				+ ", neighborhood=" + neighborhood + ", complement=" + complement + ", zipCode=" + zipCode + "]";
	}

	
	
}
