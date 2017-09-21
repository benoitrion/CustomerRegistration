package com.benoitrion.customerregistration.model;

public class Address {

	private String address;

	public Address() {}
	public Address(String address) {
		this.address = address;
	}	

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return address;
	}
}