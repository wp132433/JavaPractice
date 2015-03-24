package org.dimigo.basic;

public class Switch {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double d = Math.random();
			System.out.println(d);
			
			System.out.println((int)(d*6));
			System.out.println((int)(d*6) + 1);
		}
		
		int num = (int)(Math.random() * 6) + 1;
		
		switch (num % 2) {
		case 0:
			System.out.println("홀수 입니다.");
			break;

		case 1:
			System.out.println("홀수 입니다.");
			break;
			
		default:
			System.out.println("누구세요.");
			break;
		}
		
		String season = "봄";
		
		switch (season) {
		case "봄":
			System.out.println("따뜻하다.");
			break;
			
		case "여름":
			System.out.println("덥다.");
			break;
	
		case "가을":
			System.out.println("쌀쌀하다.");
			break;
			
		case "겨울":
			System.out.println("춥다.");
			break;

		default:
			System.out.println("누구세요.");
			break;
		}
	}
}
