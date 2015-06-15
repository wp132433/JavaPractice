package org.dimigo.oop;

public class Calculator {
	private int num1;
	private int num2;
	private boolean isOn = false;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Calculator() {
	}

	public void powerOn() {
		isOn = true;
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		isOn = false;
		System.out.println("전원을 끕니다.");
	}

	public int add() {
		if (!isOn)
			powerOn();
		return num1 + num2;
	}

	public int sub() {
		if (!isOn)
			powerOn();
		return num1 - num2;
	}

	public int mul() {
		if (!isOn)
			powerOn();
		return num1 * num2;
	}

	public double div() {
		if (!isOn)
			powerOn();
		return num1 / (double) num2;
	}
}