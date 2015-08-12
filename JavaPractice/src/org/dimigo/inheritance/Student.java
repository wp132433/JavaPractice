package org.dimigo.inheritance;

public class Student extends Person {
	private String studentID;

	public Student(String name, String studentID, int age, int height, int weight) {
		super(name, age, height, weight);

		this.studentID = studentID;
	}	
}