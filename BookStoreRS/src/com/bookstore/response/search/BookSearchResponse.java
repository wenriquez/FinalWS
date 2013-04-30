package com.bookstore.response.search;

import java.util.*;

import com.bookstore.inventory.Book;

public class BookSearchResponse {
	
	List<Book> searchResults = new ArrayList<Book>();
	
	public BookSearchResponse() {}
	
	public BookSearchResponse(List<Book> books)
	{
		searchResults = books;
	}

	public List<Book> getSearchResults() {
		return searchResults;
	}

	public void setSearchResults(List<Book> searchResults) {
		this.searchResults = searchResults;
	}

}
