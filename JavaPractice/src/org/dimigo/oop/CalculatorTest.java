package org.dimigo.oop;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		Calculator c = new Calculator(num1, num2);

		c.powerOn();
		System.out.println(num1 + " + " + num2 + " = " + c.add());
		System.out.println(num1 + " - " + num2 + " = " + c.sub());
		System.out.println(num1 + " * " + num2 + " = " + c.mul());
		System.out.println(num1 + " / " + num2 + " = " + c.div());
		c.powerOff();
	}
}