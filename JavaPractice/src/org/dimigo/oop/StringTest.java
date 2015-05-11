package org.dimigo.oop;

public class StringTest {
	public static void main(String[] args) {
		String dog1 = "멍멍이";
		String dog2 = "멍멍이";
		
		String cat1 = new String("야옹이");
		String cat2 = new String("야옹이");
		
		System.out.println(dog1 == dog2);
		System.out.println(cat1 == cat2);
		
		System.out.println(cat1.equals(cat2));
		
		System.out.println("admin".equals(dog1));
		
		System.out.println("admin".equalsIgnoreCase("Admin"));
	}

}
