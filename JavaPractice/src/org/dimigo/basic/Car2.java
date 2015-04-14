package org.dimigo.basic;

public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(String _company, String _model, String _color) {
		company = _company;
		model = _model;
		color = _color;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean forward(int speed) {
		return true;
	}
	
	public boolean stop() {
		return true;
	}
}
