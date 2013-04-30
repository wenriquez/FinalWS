package com.bookstore.service.representation;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.bookstore.links.link;

@XmlRootElement(name = "Book")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class BookRepresentation {
	
	private String title;
	private String isbn;
	private String authorFname;
	private String authorLname;
	private String authorMname;
	private double price;
	
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
	public String getTitle()
	{
		return title;
	}
	 public void setTitle(String string)
	{
		this.title = string;
		
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setIsbn(String string)
	{
		
	    this.isbn = string;
	}
	public String getAuthF()
	{
		return (this.authorFname);
	}
	
	public void setAuthF(String string)
	{
		(this.authorFname) = string;
	}
	public String getAuthL()
	{
		return (this.authorLname);
	}
	
	public void setAuthL(String string)
	{
		(this.authorLname) = string;
	}
	public String getAuthM()
	{
		return (this.authorMname);
	}
	public void setAuthM(String string)
	{
		(this.authorMname) = string;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double amount)
	{
		this.price = amount;
	}

}
