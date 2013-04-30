package com.bookstore.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")

public class SearchBookRequest {
	
	private String title;
	private String authorFname;
	private String authorLname;
	private String authorMname;
	
	public SearchBookRequest(){}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFname() {
		return authorFname;
	}

	public void setAuthorFname(String authorFname) {
		this.authorFname = authorFname;
	}

	public String getAuthorLname() {
		return authorLname;
	}

	public void setAuthorLname(String authorLname) {
		this.authorLname = authorLname;
	}

	public String getAuthorMname() {
		return authorMname;
	}

	public void setAuthorMname(String authorMname) {
		this.authorMname = authorMname;
	}
}
