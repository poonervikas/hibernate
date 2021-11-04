package com.xml_mapping;

public class Laptop {
	private int id;
	private String company;
	private String model;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Laptop(int id, String company, String model) {
		super();
		this.id = id;
		this.company = company;
		this.model = model;
	}
	public Laptop() {
		super();
	}
	

}
