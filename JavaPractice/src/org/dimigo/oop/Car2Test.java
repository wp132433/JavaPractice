package org.dimigo.oop;

public class Car2Test {
	public static void main(String[] args) {
		Car2 car1 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : "+car1.getCompany());
		System.out.println("모델명 : "+car1.getModel());
		System.out.println("색상 : "+car1.getColor());
		System.out.println("최대속도 : "+car1.getMaxSpeed()+"km");
		System.out.print("가격 : ");
		System.out.format("%,d", car1.getPrice());
		System.out.println("원");
		System.out.println();
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getMaxSpeed()+"km");
		System.out.print("가격 : ");
		System.out.format("%,d", car2.getPrice());
		System.out.println("원");
		System.out.println();
		
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getMaxSpeed()+"km");
		System.out.print("가격 : ");
		System.out.format("%,d", car3.getPrice());
		System.out.println("원");
		System.out.println();
	}
}
