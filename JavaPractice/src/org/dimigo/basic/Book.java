package org.dimigo.basic;

public class Book {
	
	private String title = "미생";
	private String author = "윤태희";
	private int page_cnt = 1000;
	
	public Book() {
		
	}
	
	public Book(String _title, String _author, int _page_cnt) {
		title = _title;
		author = _author;
		_page_cnt = page_cnt;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPageCnt() {
		return page_cnt;
	}
	
	public void setTitle(String _title) {
		title = _title;
	}
	
	public void setAuthor(String _author) {
		author = _author;
	}

	public void setPageCnt(int _page_cnt) {
		page_cnt = _page_cnt;
	}

}
