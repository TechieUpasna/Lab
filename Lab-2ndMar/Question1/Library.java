package com.cognizant.tax;

public class Library {
	//instance variables
	private int bookId;
	private String bookName,bookAuthor;
	//methods
	void addBook(int bookId,String bookName,String bookAuthor) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		System.out.println("The new book added to library is: "+bookId+" Name: "+bookName+" and Author's Name: "+bookAuthor);
	}
void dispanseBook(int bookId,String bookName,String bookAuthor) {
	this.bookId=bookId;
	this.bookName=bookName;
	this.bookAuthor=bookAuthor;
	System.out.println("The new book added to library is: "+bookId+" Name: "+bookName+" and Author's Name: "+bookAuthor);
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}


}
