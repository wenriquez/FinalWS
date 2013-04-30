package com.bookstore.orders;

import java.io.Serializable;
import java.util.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
public class CreditCard implements Serializable{

	private static final long serialVersionUID = 2L;

	private String creditCardNum;
	private int month;
	private int year;
	private int securityCode;
	private String fname;
	private String lname;
	private String mname;
	private String steetName;
	private String city;
	private String state;
	private String zipcode;
	private String phoneNumber;
	
	public CreditCard(){}
	
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getSteetName() {
		return steetName;
	}
	public void setSteetName(String steetName) {
		this.steetName = steetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString(){
	
		StringBuilder temp = new StringBuilder();
		
		temp.append("Name: ");
		temp.append(fname+" "+lname+"\n");
		temp.append("Street: "+steetName+"\n");
		temp.append("City: "+city+" State: "+state+"\n");
		temp.append("Zip code: "+zipcode+"\n");
		temp.append("Phone number: "+phoneNumber+"\n");
	    temp.append("Credit card Number: "+creditCardNum+"\n");
	    temp.append("Expiration: "+month+"/"+year+"\n");
	    temp.append("Security Code: "+securityCode+"\n");
		
		return temp.toString();

	}
	

}
