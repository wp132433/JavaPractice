package org.dimigo.oop;

public class PiggyBank {
	static int balance;
	
	static void putMoney(FamilyMember member, int amount) {
		System.out.println(member.memberName + " " + amount + "원 넣음");
		balance += amount;
	}
	
	static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
	
	
}
