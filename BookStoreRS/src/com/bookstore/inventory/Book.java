package com.bookstore.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String isbn;
	private String authorFname;
	private String authorLname;
	private String authorMname;
	private double price;
	
	public Book(){}
	
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
	
	@Override
	public boolean equals(Object other)
	{
		Book temp = (Book) other;
	
	  if(this.authorFname != null && temp.getAuthF() !=null && this.authorLname !=null && temp.getAuthL() != null
		 && this.title != null && temp.getTitle() !=null){
		  if(this.authorMname != null && temp.authorMname !=null){
			  
			  if(this.authorFname.equalsIgnoreCase(temp.getAuthF()) && this.authorLname.equalsIgnoreCase(temp.getAuthL()) 
					   && this.authorMname.equalsIgnoreCase(temp.getAuthM()) &&
					   this.title.equalsIgnoreCase(temp.getTitle())){
				  return true;
				  
			  }
			  else
				  return false;
			  
			  
		  }
		  else
			  if(this.authorFname.equalsIgnoreCase(temp.getAuthF()) && this.authorLname.equalsIgnoreCase(temp.getAuthL()) 
				 && this.title.equalsIgnoreCase(temp.getTitle())){
				  
				  return true;
				  
			  }
			  else
				  return false;
		  
	  } // end first, last name, and title compare
		
		
		
	  else if(this.authorFname != null && temp.getAuthF() != null && 
		  this.authorLname != null && temp.getAuthL() != null){	
		
		
		if(this.authorMname != null && temp.authorMname !=null)
		{
			if(this.authorFname.equalsIgnoreCase(temp.getAuthF()) && this.authorLname.equalsIgnoreCase(temp.getAuthL()) 
			   && this.authorMname.equalsIgnoreCase(temp.getAuthM())){
				
			   return true;	   
				
			}
			else
				return false;
		}
		else{
			
			if(this.authorFname.equalsIgnoreCase(temp.getAuthF()) && 
			   this.authorLname.equalsIgnoreCase(temp.getAuthL())){
				return true;	   
				}
				else
				   return false;
	    }
			
	  }// end first name and last name compare
	  
	  else if(this.title != null && temp.getTitle() != null){
	     
		  if(this.title.equalsIgnoreCase(temp.getTitle())){
			  
			  return true;
			  
		  }
		  else
			  return false;
	  
	  
	 } // end title compare
	
	  else if(this.isbn != null && temp.getIsbn() !=null){
		  
		  if(this.isbn.equalsIgnoreCase(temp.getIsbn())){
			  
			  return true;
		  }
		  else
			  return false;
	  
	  }// end isbn compare
	
	  else
		  return false; // no match found when comparing
  }
 
	@Override
	public String toString(){
	
		StringBuilder temp = new StringBuilder();
		
	    temp.append("Title: "+title+"\n");
	    temp.append("Author: "+authorFname+" "+authorLname+"\n");
	    temp.append("ISBN: "+isbn+"\n");
	    temp.append("Price: "+price+"\n");
	    
	    return temp.toString();
	
	}
	
}
