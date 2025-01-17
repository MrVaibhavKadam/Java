package com.app.core;

public class Address {
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", phoneNo=" + phoneNo + "]";
	}

	private String city, state, phoneNo;

	public Address(String city, String state, String phoneNo) {
		super();
		this.city = city;
		this.state = state;
		this.phoneNo = phoneNo;
	}
	
}
