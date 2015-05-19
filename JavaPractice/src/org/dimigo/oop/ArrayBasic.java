package org.dimigo.oop;

public class ArrayBasic {
	public static void main(String[] args) {
		String[] name = new String[3];
		
		name[0] = "a";
		name[1] = "b";
		name[2] = "c";
		
		for(String value : name)
			System.out.println(value);
		
		Book[] books = new Book[3];
		
		books[0] = new Book("ee", "aa", 30);
		
		for(Book book : books)
			System.out.println(book);
		
	}

}
