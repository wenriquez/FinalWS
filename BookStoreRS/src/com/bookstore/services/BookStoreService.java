package com.bookstore.services;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.ws.rs.core.Response;

import com.bookstore.*;
import com.bookstore.inventory.Book;
import com.bookstore.orders.Order;
import com.bookstore.orders.OrderStatus;
import com.bookstore.response.search.BookSearchResponse;
import com.bookstore.service.representation.BookRepresentation;
import com.bookstore.service.representation.OrderRepresentation;
import com.bookstore.service.representation.OrderStatusRepresentation;
import com.bookstore.service.request.BuyBookRequest;
import com.bookstore.service.request.CancelOrderRequest;
import com.bookstore.service.request.OrderStatusRequest;
import com.bookstore.service.request.SearchBookRequest;


@WebService
public interface BookStoreService {
	
	
	 Response search(SearchBookRequest bookRequest);
	

	 Response addOrder(BuyBookRequest orderRequest);
	

	 Response getStatus(OrderStatusRequest statusRequest);
	
	
	 Response cancelOrder( CancelOrderRequest statusRequest);

}
