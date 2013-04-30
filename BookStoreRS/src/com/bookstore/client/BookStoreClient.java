package com.bookstore.client;


import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;


import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;


import com.bookstore.inventory.Book;
import com.bookstore.inventory.BookDao;
import com.bookstore.inventory.MockBook;
import com.bookstore.orders.MockOrder;
import com.bookstore.orders.Order;
import com.bookstore.orders.OrderDao;
import com.bookstore.orders.OrderStatus;
import com.bookstore.response.search.BookSearchResponse;
import com.bookstore.service.request.BuyBookRequest;
import com.bookstore.service.request.CancelOrderRequest;
import com.bookstore.service.request.OrderStatusRequest;
import com.bookstore.service.request.SearchBookRequest;
import com.bookstore.services.BookStoreService;


public final class BookStoreClient {
	
	private BookStoreClient(){}
	
	  public static void main(String args[]) throws Exception {
	

	    	 List<Object> providers = new ArrayList<Object>();
	         JacksonJsonProvider provider = new JacksonJsonProvider();
	         provider.addUntouchable(Response.class);
	         providers.add(provider);	  
	        
	         /*****************************************************************************************
	          * POST METHOD invoke
	         *****************************************************************************************/
	         System.out.println("POST METHOD .........................................................");
	         WebClient postClient = WebClient.create("http://localhost:8080", providers);
	         WebClient.getConfig(postClient).getOutInterceptors().add(new LoggingOutInterceptor());
	         WebClient.getConfig(postClient).getInInterceptors().add(new LoggingInInterceptor());
	                  
	         // change application/xml  to application/json get in json format
	         postClient = postClient.accept("application/xml").type("application/json").path("/BookStoreRS/search");
	      	
	         String postRequestURI = postClient.getCurrentURI().toString();
	         System.out.println("Client POST METHOD Request URI:  " + postRequestURI);
	         String postRequestHeaders = postClient.getHeaders().toString();
	         System.out.println("Client POST METHOD Request Headers:  " + postRequestHeaders);

	         


	         MockBook book = new MockBook();
	         BookDao bdao = new BookDao();
	         MockOrder ord = new MockOrder();
	         OrderDao odao = new OrderDao();
	
	         bdao.addBook(book.make()); // add a mock book to the inventory
	
	         BuyBookRequest buy = new BuyBookRequest();
	
	         buy.setCard(ord.getCard());
	         buy.setCust(ord.getCust());
	         buy.setOrders(ord.getOrders());
	         buy.setStat(ord.getStat());
	         
		     //String responsePost =  
	         postClient.post(buy, String.class);
		     //System.out.println("POST MEDTHOD Response ........." + responsePost);
	/*
	//Order result = bookService.addOrder(buy); // didn't use
	
	SearchBookRequest seek = new SearchBookRequest();
	
    seek.setTitle(book.make().getTitle());
    seek.setAuthorFname(book.make().getAuthF());
    seek.setAuthorLname(book.make().getAuthL());

	
	BookSearchResponse seekResult = bookService.search(seek); // Payload isn't showing the correct return value
	
	//if(seekResult != null)
	//{
		//System.out.println(seekResult.getPrice());
	//}
	
	//BookDao bdao2 = new BookDao();
	
	//Book exp = bdao2.search("Homework 3",null,null,null);
	
	//System.out.println(exp.getTitle());
	
    OrderStatusRequest status = new OrderStatusRequest();

	status.setOrderNum(1);
	
	OrderStatus stat = bookService.getStatus(status); // didn't use result
	
	CancelOrderRequest req = new CancelOrderRequest();
	
	req.setOrderNum(1);
	
	result = bookService.cancelOrder(req);
	
	*/
	}

}
