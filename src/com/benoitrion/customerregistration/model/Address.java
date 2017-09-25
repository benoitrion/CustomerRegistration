package com.benoitrion.customerregistration.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Address {

	@NotEmpty
	private String street;

	@NotEmpty
	private String state;

	public Address() {}

	public Address(String street, String state) {
		this.street = street;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return street;
	}
}