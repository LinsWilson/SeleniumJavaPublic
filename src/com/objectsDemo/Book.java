package com.objectsDemo;

public class Book {
	
	
	//Global variables
	String bookTitle;
	String bookAuthor;
	float bookPrice;
	
	//Default constructor
	public Book() {
		System.out.println("Inside the default constructor");
	}
	
	//Constructor override
	public Book(String bookTitle, String bookAuthor, float bookPrice) {
		
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		System.out.println("Inside the 3 parameter constructor");
		System.out.println("bookTitle:"+this.bookTitle);
		System.out.println("bookAuthor:"+this.bookAuthor);
		System.out.println("bookPrice:"+this.bookPrice);
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public void display(String bookTitle, String bookAuthor, float bookPrice) {
		System.out.println(bookTitle+" book by "+bookAuthor+" costs INR " +bookPrice);
	}
	

}
