package com.bookstore.orders;

public class OrderDao {

	private MockStorageOrders temp = new MockStorageOrders();
	
	public OrderDao() {}
	
	public long addOrder(Order ord)
	{
		return temp.saveOrder(ord);
		
	}
	
	public void deleteOrder(Order ord)
	{
		temp.deleteOrder(ord);
	}
	
	public Order findOrder(long numOrder)
	{
		return temp.findOrder(numOrder);
	}
	
	public void cancelOrder(long numOrder)
	{
		temp.cancelOrder(numOrder);
	}
	
	public OrderStatus getStatus(long numOrder)
	{
		return temp.getStatus(numOrder);
	}

	public MockStorageOrders getTemp() {
		return temp;
	}

	public void setTemp(MockStorageOrders temps) {
		temp = temps;
	}
	
}
