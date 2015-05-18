package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int kor;
		int mat;
		int eng;
		
		sb.append("<<성적표>>\n");
		
		System.out.println("국어 점수 : ");
		kor = scanner.nextInt();
		sb.append("국어 점수 : ").append(kor).append("점\n");
		total += kor;
		
		System.out.println("수학 점수 : ");
		mat = scanner.nextInt();
		sb.append("수학 점수 : ").append(mat).append("점\n");
		total += mat;
		
		System.out.println("영어 점수 : ");
		eng = scanner.nextInt();
		sb.append("영어 점수 : ").append(eng).append("점\n");
		total += eng;
		
		sb.append("총점 : ").append(total).append("점\n");
		sb.append("평균 : ").append(String.format("%.1f", (double)total/3)).append("점");
		
		System.out.println(sb.toString());
	}

}
