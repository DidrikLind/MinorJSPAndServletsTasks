package io.github.didriklind.javaClasses;

import java.io.Serializable;
import java.util.Date;

public class BlogBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String header;
	private String author;
	private Date date;
	private	String text;

	public BlogBean() {
		
	}

	public BlogBean(int id, String header, String author, Date date, String text) {
		super();
		this.header = header;
		this.author = author;
		this.date = date;
		this.text = text;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
