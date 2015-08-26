package org.dimigo.inheritance;

public class Person {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Person() {
		
	}

	public void sayHello() {

	}

	public void sayBye() {

	}

	@Override
	public String toString() {
		return "나는" + this.getClass().toString() + "사람" + name + "입니다";
	}
}
