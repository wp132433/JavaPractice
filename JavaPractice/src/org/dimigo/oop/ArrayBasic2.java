package org.dimigo.oop;

public class ArrayBasic2 {
	public static void main(String[] args) {
		String[] hello = {"hello", "world", "!!"};
		
		for(String str : hello) {
			System.out.println(str);
		}
		
		Book[] books = new Book[3];
		
		for(int i=0; i < books.length; i++) {
			books[i] = new Book();
		}
		
		for(Book book : books) {
			System.out.println(book.getTitle());
		}
	}
}
