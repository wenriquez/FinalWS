package com.bookstore.orders;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderStatus implements Serializable{

	private static final long serialVersionUID = 5L;
	
	public static enum Status {
	    Processing,Shipped,Delivered, Canceled
	}
	
	private Status stat;
	
	public OrderStatus(){};
	
	public Status getStat() {
		return stat;
	}

	public void setStat(Status stat) {
		this.stat = stat;
	}

	@Override
	public String toString(){
		
		return stat.toString();
	}

}
