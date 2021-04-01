package com.autowiring;

public class emp {

	Address addrs;

	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public emp(Address addrs) {
		super();
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "emp [addrs=" + addrs + "]";
	}
}
