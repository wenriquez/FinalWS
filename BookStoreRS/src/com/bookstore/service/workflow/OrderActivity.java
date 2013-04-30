package com.bookstore.service.workflow;

import com.bookstore.orders.Order;
import com.bookstore.orders.OrderDao;
import com.bookstore.orders.OrderStatus;
import com.bookstore.orders.OrderStatus.Status;
import com.bookstore.service.representation.OrderRepresentation;
import com.bookstore.service.representation.OrderStatusRepresentation;
import com.bookstore.service.request.BuyBookRequest;
import com.bookstore.service.request.CancelOrderRequest;
import com.bookstore.service.request.OrderStatusRequest;

public class OrderActivity {

	private static OrderDao dao = new OrderDao();
	
	public OrderActivity() {}
	
	 public OrderRepresentation addOrder(BuyBookRequest orderRequest){
		 
		 OrderRepresentation temp = new OrderRepresentation();
		 
		 Order temp2 = new Order();
		 OrderStatus stat = new OrderStatus();
		 stat.setStat(Status.Processing);
		 
		 temp2.setCard(orderRequest.getCard());
		 temp2.setCust(orderRequest.getCust());
		 temp2.setOrders(orderRequest.getOrders());
		 temp2.setStat(stat);
		 
		 Long ID  = dao.addOrder(temp2);
		 
		 temp2.setOrderNumber(ID);
		 
		 temp.setOrders(temp2);

		 return temp;
	}

	 public OrderRepresentation cancelOrder(CancelOrderRequest statusRequest){
		 
		 OrderRepresentation temp = new OrderRepresentation();
		 
         dao.cancelOrder(statusRequest.getOrderNum());
         
         Order temp2 = dao.findOrder(statusRequest.getOrderNum());
         
		 temp.setOrders(temp2);
		 return temp;
		 
		 
	 }
	 
	public OrderStatusRepresentation getStatus(OrderStatusRequest statusRequest){
		 
		 OrderStatusRepresentation temp = new OrderStatusRepresentation();
		 
		 Order temp2 = dao.findOrder(statusRequest.getOrderNum());
		 
		 temp.setStat(temp2.getStat().toString());
		 
		 return temp;
		 
	 }
	 
	 
}
