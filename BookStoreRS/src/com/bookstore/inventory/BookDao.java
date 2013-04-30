package com.bookstore.inventory;

import java.util.*;

public class BookDao {
	
	private MockStorageBook temp = new MockStorageBook();
	
	public BookDao() {}
	
    public List<Book> search(String bookTitle, String authfname, String authlname, String authmname)
    {
    	return temp.search(bookTitle,authfname,authlname,authmname);
    }
	
    public List<Book> search(String bookTitle)
    {
    	return temp.search(bookTitle);
    }
    
    public List<Book> search(String authfname, String authlname, String authmname)
    {
    	return temp.search(authfname, authlname, authmname);
    }
    
    public void addBook(Book book)
    {
    	 temp.addBook(book);
    }
    
    public void deleteBook(Book book)
    {
    	 temp.deleteBook(book);
    }

	public MockStorageBook getTemp() {
		return temp;
	}

	public void setTemp(MockStorageBook temp) {
		this.temp = temp;
	}

}
