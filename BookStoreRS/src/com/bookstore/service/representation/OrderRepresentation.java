package com.bookstore.service.representation;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.bookstore.inventory.Book;
import com.bookstore.links.link;
import com.bookstore.orders.CreditCard;
import com.bookstore.orders.Customer;
import com.bookstore.orders.Order;
import com.bookstore.orders.OrderStatus;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class OrderRepresentation {
	
	private String orders;
	
	private List<link> uri;
	

	
    public void addLink(link links){
		
		uri.add(links);
	}
	
	public List<link> getUri() {
		return uri;
	}

	public void setUri(List<link> uri) {
		this.uri = uri;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public OrderRepresentation(){}
	
	public String getOrders() {
		return orders;
	}

	public void setOrders(Order order) {

		this.orders = order.toString();
	}

	
	
	
}
