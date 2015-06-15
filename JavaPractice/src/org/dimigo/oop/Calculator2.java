package org.dimigo.oop;

public class Calculator2 {
	private int num1;
	private int num2;
	private boolean isOn = false;

	public Calculator2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Calculator2() {
	}

	public void powerOn() {
		isOn = true;
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		isOn = false;
		System.out.println("전원을 끕니다.");
	}

	public static int add(Calculator2 self, int num1, int num2) {
		if (!self.isOn)
			self.powerOn();
		return num1 + num2;
	}

	public static int sub(Calculator2 self, int num1, int num2) {
		if (!self.isOn)
			self.powerOn();
		return num1 - num2;
	}

	public static int mul(Calculator2 self, int num1, int num2) {
		if (!self.isOn)
			self.powerOn();
		return num1 * num2;
	}

	public static double div(Calculator2 self, int num1, int num2) {
		if (!self.isOn)
			self.powerOn();
		return num1 / (double) num2;
	}
}