package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		long month = 1700000l;
		int person = 3;
		int stores = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", month) + "원");
		System.out.println("점포 내 직원 수 : " + person + "명");
		System.out.println("점포 수 : " + String.format("%,d", stores) + "개");
		System.out.println("\n");
		System.out.println("연간 인건비 : " + String.format("%,d", (month*12*person*stores)));
	}
}
 