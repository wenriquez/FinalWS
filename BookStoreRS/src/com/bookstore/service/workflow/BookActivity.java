package com.bookstore.service.workflow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bookstore.inventory.Book;
import com.bookstore.inventory.BookDao;
import com.bookstore.service.representation.BookRepresentation;
import com.bookstore.service.request.SearchBookRequest;


public class BookActivity {

	public BookActivity() {}
	
	private static BookDao dao = new BookDao();
	
	public List<BookRepresentation> search(SearchBookRequest bookRequest){
		
		List<BookRepresentation> temp = new ArrayList<BookRepresentation>();
		
		String title = bookRequest.getTitle();
		String fname = bookRequest.getAuthorFname();
		String lname = bookRequest.getAuthorLname();
		String mname = bookRequest.getAuthorMname();
		
		List<Book> temp2 = dao.search(title, fname, lname, mname);
		
		Iterator<Book> it = temp2.iterator();
		
		while(it.hasNext()) {
			
			BookRepresentation temp3 = new BookRepresentation();
			
			Book book = (Book)it.next();
			
			temp3.setAuthF(book.getAuthF());
			temp3.setAuthL(book.getAuthL());
			temp3.setAuthM(book.getAuthM());
			temp3.setTitle(book.getTitle());
			temp3.setIsbn(book.getIsbn());
			temp3.setPrice(book.getPrice());
			
			temp.add(temp3);
	   }
		
		return temp;
		
	}

	
	
}
