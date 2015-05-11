package org.dimigo.oop;

import org.dimigo.basic.Book;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("a", "b", 3);
		
		Book book2 = book;
		
		System.out.println(book == book2);
		
		System.out.println(book2.getTitle());
		
		book2.setTitle("abc");
		
		System.out.println(book.getTitle());
	}
}
