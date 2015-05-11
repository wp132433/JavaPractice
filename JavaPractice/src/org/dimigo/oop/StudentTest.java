package org.dimigo.oop;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(13, 2, 3, 1);
		Student s2 = new Student(13, 2, 3, 2, "박명수");
		Student s3 = new Student(13, 2, 3, 3, "정준하", "안산시");
		Student s4 = new Student(13, 2, 3, 4, "정형돈", "서울시", "010-444-4444");
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		s4.printStudent();
	}
}
