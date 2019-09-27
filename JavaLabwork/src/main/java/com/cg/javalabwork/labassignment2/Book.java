package com.cg.javalabwork.labassignment2;

public class Book extends WrittenItem {
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	


	public Book(int itemId, String itemName, int itemCount, int noOfCopies,String author) {
		super(itemId, itemName, itemCount, noOfCopies,author);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Book id: "+this.getItemId());
		System.out.println("Book title: : "+this.getItemName());
		System.out.println("Number Of Copies: "+this.getNoOfCopies());
		System.out.println("Author: "+this.getAuthor());

	}
	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", toString()=" + super.toString() + ", getItemId()=" + getItemId()
				+ ", getItemName()=" + getItemName() + ", getItemCount()=" + getItemCount() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



}
