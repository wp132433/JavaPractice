package org.dimigo.basic;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book();
		
		System.out.println(book);
		System.out.println(book2);
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPageCnt());
		
		book2.setTitle("자바를 잡아라");
		
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		System.out.println(book2.getPageCnt());
	}
}
