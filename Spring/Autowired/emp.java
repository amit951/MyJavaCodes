package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	@Autowired //@Autowired    Autowiring actually works like type autowiring
	@Qualifier("a2")
	Address addrs;
	  //@Autowired		Autowiring works on setter
	public Address getAddrs() {
		System.out.println("Inside Setter");
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	    // @Autowired  Autowiring actually works on constructor
	public emp(Address addrs) {
		super();
		System.out.println("Inside Para Constr");
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "emp [addrs=" + addrs + "]";
	}
}
