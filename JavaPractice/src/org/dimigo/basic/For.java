package org.dimigo.basic;

public class For {
	public static void main(String[] args) {
		System.out.println("<< 번호 출력하기 >>");
		for(int i=1; i<=36; i++) {
			System.out.println(i + "번");
			if(i % 10 == 0) System.out.println();
		}
		
		System.out.println("구구단 출력하기");
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(String.format("%d * %d = %d ", i, j, i*j));
			}
			System.out.println();
		}
		
		int[] intArr = {10, 20, 30};
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("<< 무한도전 맴버 >>");
		String[] strArr = {"유재석", "정준하", "박명수", "하하", "정형돈"};
		
		for(String str : strArr) {
			System.out.println(str);
		}
	}

}
