package com.bookstore.orders;

public class Refund {
	
	public Refund(){}
	
	public void refund(Order ord )
	{
		processRefund(ord);
		
	}
	 
    private void processRefund(Order ord)
    {
    	// Do something with paypal to return payment
    }
	
}
