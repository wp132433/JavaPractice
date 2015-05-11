package org.dimigo.oop;

public class Student {
	private int gisu;
	private int grade;
	private int ban;
	private int number;
	private String name = "이름없음";
	private String address = "주소없음";
	private String phone = "휴대폰없음";
	
	public int getGisu() {
		return gisu;
	}

	public void setGisu(int gisu) {
		this.gisu = gisu;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Student(int _gisu, int _grade, int _ban, int _number, String _name, String _address, String _phone) {
		gisu = _gisu;
		grade = _grade;
		ban = _ban;
		number = _number;
		name = _name;
		address = _address;
		phone = _phone;
	}
	
	public Student(int _gisu, int _grade, int _ban, int _number, String _name, String _address) {
		gisu = _gisu;
		grade = _grade;
		ban = _ban;
		number = _number;
		name = _name;
		address = _address;
	}
	
	public Student(int _gisu, int _grade, int _ban, int _number, String _name) {
		gisu = _gisu;
		grade = _grade;
		ban = _ban;
		number = _number;
		name = _name;
	}
	
	public Student(int _gisu, int _grade, int _ban, int _number) {
		gisu = _gisu;
		grade = _grade;
		ban = _ban;
		number = _number;
	}
	
	public void printStudent() {
		System.out.println("<< 학생 정보 출력 >>");
		System.out.println("1. 학번 : " + String.format("%2d%2d%2d", gisu, grade, number));
		System.out.println("2. 이름 : " + name);
		System.out.println("3. 주소 : " + address);
		System.out.println("4. 휴대폰번호 : " + phone);
	}
}
