
package com.bookstore.inventory;

import java.util.*;

public class MockStorageBook {

	private static List<Book> tempBooks = new ArrayList<Book>();
	
	public MockStorageBook(){}
	
	public void addBook(Book book)
	{
		tempBooks.add(book);
	}
	public void deleteBook(Book book)
	{
		if(tempBooks.contains(book))
		{
			tempBooks.remove(book);
		}
	}
   
	
	
	public List<Book> search(String title, String fname, String lname, String mname)
	{
		
		Book data = new Book();
		data.setTitle(title);
		data.setAuthF(fname);
		data.setAuthL(lname);
		data.setAuthM(mname);
		
		List<Book> temp = new ArrayList<Book>();
		
		for(int i= 0; i < tempBooks.size(); i++)
		
		   if(tempBooks.get(i).equals(data)){
			
			    temp.add(tempBooks.get(i));
			
		   }
		
		  return temp;
		
		
	}
    
	public List<Book> search(String title)
	{
		return search(title,null,null,null);
		
	}
	
	public List<Book> search(String fname, String lname, String mname)
	{
		return search(null,fname,lname,mname);
	}
}