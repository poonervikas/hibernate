package com.pooner.hibernate_tuts;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String houseNumber;
	private String city;
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String houseNumber, String city) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
	}
	public Address() {
		super();
	}
	

}
