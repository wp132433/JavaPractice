package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	
	private static final String[] questions = {
		"1+1=?",
		"2+2=?",
		"3+3=?"
	};
	
	private static final String[] answers = {
		"2",
		"4",
		"6"
	};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<questions.length; i++) {
			System.out.println(questions[i]);
			String reply = scanner.next();
			
			System.out.println(reply.equals(answers[i]));
		}
	}
}
