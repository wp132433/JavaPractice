package org.dimigo.basic;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setPrice(100000);
		
		System.out.println(String.format("%,d", car.getPrice()));
	}
}
