package com.forgemycode.beans;

public class Vehicle {

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle() {

	}

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

}
