package com.bookstore.services;


import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;
import com.bookstore.*;
import com.bookstore.inventory.Book;
import com.bookstore.inventory.BookDao;
import com.bookstore.inventory.MockBook;
import com.bookstore.inventory.MockStorageBook;
import com.bookstore.links.link;
import com.bookstore.orders.Order;
import com.bookstore.orders.OrderDao;
import com.bookstore.orders.OrderStatus;
import com.bookstore.orders.OrderStatus.Status;
import com.bookstore.response.search.BookSearchResponse;
import com.bookstore.service.representation.BookRepresentation;
import com.bookstore.service.representation.OrderRepresentation;
import com.bookstore.service.representation.OrderStatusRepresentation;
import com.bookstore.service.request.BuyBookRequest;
import com.bookstore.service.request.CancelOrderRequest;
import com.bookstore.service.request.OrderStatusRequest;
import com.bookstore.service.request.SearchBookRequest;
import com.bookstore.service.workflow.BookActivity;
import com.bookstore.service.workflow.OrderActivity;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;


@Path("/BookStoreRS/")
public class BookStoreServiceImpl implements BookStoreService {

	private @Context UriInfo uriInfo;
	
	@GET
	@Produces("application/vnd.bookstore+xml")
	@Path("/search")
	public  Response search( SearchBookRequest bookRequest) {
 
		try{
		
		BookActivity temp = new BookActivity();
		
		List<BookRepresentation> Lnoo = temp.search(bookRequest);
		
		String orderpath = "/BookStoreRS/order/add"; 
		
		link tem = new link();
		
		tem.setUri(orderpath);
		tem.setAction("POST");
		

		Iterator<BookRepresentation> it = Lnoo.iterator();
		
		while(it.hasNext()) {
			
			BookRepresentation temp3 = new BookRepresentation();
			
			temp3 = it.next();
			
			temp3.addLink(tem);
			
		 }
		
		
		return Response.ok(Lnoo).build();
		}
		catch(Exception ex){
			return  Response.serverError().build();
		}
		
		
    }

	@POST
	@Produces("application/vnd.bookstore+xml")
	@Path("/order/add")
	public  Response addOrder( BuyBookRequest orderRequest) {
		
		try{
		
		OrderActivity temp = new OrderActivity();
		
		OrderRepresentation boo =  temp.addOrder(orderRequest);
		

			String deletepath = "/BookStoreRS/order/delete"; 
			String statuspath = "/BookStoreRS/search/status";
			
			link tem = new link();
			link tem2 = new link();
			
			tem.setUri(deletepath);
			tem.setAction("DELETE");
			
			tem2.setUri(statuspath);
			tem2.setAction("GET");
			
            boo.addLink(tem);
            boo.addLink(tem2);
			
			
			
			return Response.ok(boo).build();
			}
			catch(Exception ex){
				return  Response.serverError().build();
			}
		
		
	}

	
	@GET
	@Produces("application/vnd.bookstore+xml")
	@Path("/search/status")
    public  Response getStatus( OrderStatusRequest statusRequest) {
  
		try{
		
    	OrderActivity temp = new OrderActivity();
    	
    	OrderStatusRepresentation boo =  temp.getStatus(statusRequest);
		
    	String deletepath = "/BookStoreRS/order/delete"; 
		
    	link tem = new link();
		
		tem.setUri(deletepath);
		tem.setAction("DELETE");
		
		boo.addLink(tem);
		
		return Response.ok(boo).build();
		
		}
		catch(Exception ex){
			return  Response.serverError().build();
		}
		
	}

    @DELETE
	@Produces("application/vnd.bookstore+xml")
	@Path("/order/delete")
	public  Response cancelOrder(CancelOrderRequest statusRequest) {

    	try{
    	
		OrderActivity temp = new OrderActivity();
		
		String statuspath = "/BookStoreRS/search/status";
		
		link tem2 = new link();
		
		
		tem2.setUri(statuspath);
		tem2.setAction("GET");
		
		OrderRepresentation boo =  temp.cancelOrder(statusRequest);
		
		boo.addLink(tem2);
		
		return Response.ok(boo).build();
    	
    	}
    	catch(Exception ex){
			return  Response.serverError().build();
		}
    	
    	
		
	}


	



}