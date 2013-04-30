package com.bookstore.service.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.bookstore.inventory.Book;
import com.bookstore.orders.CreditCard;
import com.bookstore.orders.Customer;
import com.bookstore.orders.OrderStatus;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class BuyBookRequest {
	
	
	private List<Book> orders = new ArrayList<Book>();
	private long orderNumber;
	private Customer cust;
	private CreditCard card;
	private OrderStatus stat;
	
	public List<Book> getOrders() {
		return orders;
	}
	public void setOrders(List<Book> orders) {
		this.orders = orders;
	}
	public long getOrderNumber() {
		return orderNumber;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public CreditCard getCard() {
		return card;
	}
	public void setCard(CreditCard card) {
		this.card = card;
	}
	public OrderStatus getStat() {
		return stat;
	}
	public void setStat(OrderStatus stat) {
		this.stat = stat;
	}

	

}
