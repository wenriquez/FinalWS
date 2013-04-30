package com.bookstore.orders;

import java.util.*;


import com.bookstore.inventory.Book;
import com.bookstore.inventory.MockBook;
import com.bookstore.orders.OrderStatus.Status;

public class MockOrder {
	
	private List<Book> orders;
	private long orderNumber;
	private Customer cust;
	private CreditCard card;
	private OrderStatus stat;
	MockBook book;
	Order ord;
	
	public MockOrder(){
		
		orders = new ArrayList<Book>();
		cust = new Customer();
		card = new CreditCard();
		stat = new OrderStatus();
		book = new MockBook();
		ord = new Order();
		setUp();
	}
	
	public void setUp(){
		
		setUpCustomer();
		setUpCreditCard();
		setUpStatus();
		orders.add(book.make());
		ord.setOrders(orders);
		ord.setCard(card);
		ord.setCust(cust);
		ord.setStat(stat);
		
	}
	
	private void setUpCustomer(){
		
		cust.setCity("Chicago");
		cust.setFname("Bob");
		cust.setLname("Thorn");
		cust.setPhoneNumber("773-453-5555");
		cust.setState("Illinois");
		cust.setSteetName("4847 Pulaski");
		cust.setZipcode("60641");
		
	}
	private void setUpCreditCard()
	{
		card.setCity(cust.getCity());
		card.setFname(cust.getFname());
		card.setLname(cust.getLname());
		card.setState(cust.getState());
		card.setSteetName(cust.getSteetName());
		card.setZipcode(cust.getZipcode());
		card.setCreditCardNum("67853535432");
		card.setMonth(11);
		card.setPhoneNumber(cust.getPhoneNumber());
		card.setYear(2013);
		card.setSecurityCode(678);
		
	}

	private void setUpStatus(){
		
		stat.setStat(Status.Processing);
		
	}

	public List<Book> getOrders() {
		return orders;
	}

	public void setOrders(List<Book> orders) {
		this.orders = orders;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
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

	public MockBook getBook() {
		return book;
	}

	public void setBook(MockBook book) {
		this.book = book;
	}

	public Order getOrd() {
		return ord;
	}

	public void setOrd(Order ord) {
		this.ord = ord;
	}
	
	
}
