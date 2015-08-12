package org.dimigo.inheritance;

public class Teacher extends Person{
	private String subject;
	
	public Teacher(String name, int age, int height, int weight, String subject) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println(name + "일한다");
	}
	
	public void doTask() {
		System.out.println(name + "업무본다");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age + " " + height + " " + weight + " " + subject;  
	}

}
