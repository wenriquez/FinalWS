package com.bookstore.inventory;

public class MockBook {
	
	Book temp;
	
	public MockBook (){
		
		temp = new Book();
	}
	
	public Book make(){
		
		temp.setAuthF("Bob");
		temp.setAuthL("Todd");
		temp.setTitle("Homework 3");
		temp.setIsbn("000303030");
		temp.setPrice(600);

		return temp;
		
	}

	
	
}
