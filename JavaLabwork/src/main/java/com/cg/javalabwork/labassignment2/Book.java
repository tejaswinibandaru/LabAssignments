package com.cg.javalabwork.labassignment2;

public class Book extends WrittenItem {
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	


	public Book(int itemId, String itemName, int itemCount, String author) {
		super(itemId, itemName, itemCount, author);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", toString()=" + super.toString() + ", getItemId()=" + getItemId()
				+ ", getItemName()=" + getItemName() + ", getItemCount()=" + getItemCount() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



}
