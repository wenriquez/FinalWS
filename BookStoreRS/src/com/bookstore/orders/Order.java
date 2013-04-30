package com.bookstore.orders;

import java.io.Serializable;
import java.util.*;

import com.bookstore.inventory.*;
import com.bookstore.service.representation.BookRepresentation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
public class Order implements Serializable{
	
	private static final long serialVersionUID = 4L;
	private List<Book> orders = new ArrayList<Book>();
	private long orderNumber;
	private Customer cust;
	private CreditCard card;
	private OrderStatus stat;
	
	public Order(){}
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (orderNumber ^ (orderNumber >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderNumber != other.orderNumber)
			return false;
		return true;
	}
	@Override
	public String toString(){
    
		StringBuilder temp = new StringBuilder();
		
        Iterator<Book> it = orders.iterator();
		
		while(it.hasNext()) {
			
			Book book = (Book)it.next();
	        
			temp.append(book.toString());
			temp.append("\n");
	   }
	
	   temp.append(cust.toString()+"\n");
	   temp.append(card.toString()+"\n");
	   temp.append(stat.toString()+"\n");
	   temp.append("Order Number: "+orderNumber+"\n");
	   
	   return temp.toString();
	   
	}
	
	

}
