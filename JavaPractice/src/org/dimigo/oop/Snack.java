package org.dimigo.oop;

public class Snack {
	private String name;
	private String company;
	private int price;
	private int count;
	
	public Snack(String _name, String _company, int _price, int _count) {
		name = _name;
		company = _company;
		price = _price;
		count = _count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
