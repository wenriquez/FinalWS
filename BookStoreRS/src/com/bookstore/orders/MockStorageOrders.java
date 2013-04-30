package com.bookstore.orders;

import java.util.*;

import com.bookstore.inventory.*;
import com.bookstore.orders.OrderStatus.Status;

public class MockStorageOrders {
	
	private static long orderNum = 000001;
	private static List<Order> tempOrder = new ArrayList<Order>();
	
	public  MockStorageOrders() {}

	public long saveOrder(Order ord)
	{
		ord.setOrderNumber(orderNum++); // simulate auto increment column
		tempOrder.add(ord);
		return ord.getOrderNumber();
	}
	
	public void deleteOrder(Order ord)
	{
		if(tempOrder.contains(ord))
		{
		   tempOrder.remove(ord);
		}
		
	}
	
	public Order findOrder(long orderNum)
	{
		Order temps;
		
		for(int i = 0; i < tempOrder.size(); i++)
		{
			temps = tempOrder.get(i);
			if(temps.getOrderNumber() == orderNum)
			{
				return temps;
			}
			
		}
	    return null;
	
	}
	
	public void cancelOrder(long orderNum)
	{
		Order temps = findOrder(orderNum);
		if(temps != null)
		{
			
			OrderStatus status = new OrderStatus();
			status.setStat(Status.Canceled);
			temps.setStat(status);
			Refund pay = new Refund();
			pay.refund(temps);
			
		}
	}
	
	public OrderStatus getStatus(long orderNum)
	{
		Order temps = findOrder(orderNum);
		
		if(temps != null)
		{
           return temps.getStat();		
		}
		else
			return null;
	}
	
}
