package com.autowired;

public class Address {
	String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

}
