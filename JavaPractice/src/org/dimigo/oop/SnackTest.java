package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args) {
		Snack[] snacks = new Snack[3];
		
		snacks[0] = new Snack("새우깡", "농심", 1100, 2);
		snacks[1] = new Snack("콘칩", "크라운", 1200, 2);
		snacks[2] = new Snack("허니빠다칩", "해태", 1500, 2);
		
		for(Snack snack : snacks) {
			System.out.println(snack.getName());
			System.out.println(snack.getCompany());
			System.out.println(String.format("%,d", snack.getPrice()) + "원");
			System.out.println(snack.getCount() + "개");
			System.out.println();
		}
	}

}
