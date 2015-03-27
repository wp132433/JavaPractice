package org.dimigo.basic;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("게임 메뉴");
			System.out.println("1공격");
			System.out.println("2수비");
			System.out.println("3종료");
			
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("공격");
				break;
			case 2:
				System.out.println("수비");
				break;
			case 3:
				System.out.println("종료");
				break;
			default:
				System.out.println("다시입력");
				break;
			}
			
			
		} while (menu != 3);
	}

}
