package com.bookstore.service.representation;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.bookstore.links.link;


@XmlRootElement(name = "OrderStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class OrderStatusRepresentation {

	
	
	public OrderStatusRepresentation(){}
	
    private String status;
	
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

	public String getStat() {
		return status;
	}

	public void setStat(String stat) {
		this.status = stat;
	}
}
