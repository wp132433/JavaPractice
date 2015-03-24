package org.dimigo.basic;

public class IfElse {
	public static void main(String[] args) {
		int age = 18;
		
		if(0 <= age && age <= 6) {
			System.out.println("유아기 입니다.");
		} else if(7 <= age && age <= 12) {
			System.out.println("아동기 입니다.");
		} else if(13 <= age && age <= 15) {
			System.out.println("사춘기 입니다.");
		} else if(16 <= age && age <= 24) {
			System.out.println("청년 입니다.");
		} else {
			System.out.println("성인 입니다.");
		}
		
		int i = 5;
		
		if(i > 10) {
			if(i < 100) {
				System.out.println("10보다 크고 100보다 작다.");
			}
		}
		else {
			System.out.println("10보다 작거나 같다.");
		}
	}

}
