package com.cg.javalabwork.labassignment2;

public class Journal extends WrittenItem {
	
	private int publishedYear;
	
	public Journal() {
		// TODO Auto-generated constructor stub
	}
	

	public Journal(int itemId, String itemName, int itemCount, int noOfCopies,String author,int publishedYear) {
		super(itemId, itemName, itemCount, noOfCopies,author);
		this.publishedYear=publishedYear;
		// TODO Auto-generated constructor stub
	}


	public int getPublishedYear() {
		return publishedYear;
	}


	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "Journal [publishedYear=" + publishedYear + ", getAuthor()=" + getAuthor() + ", toString()="
				+ super.toString() + ", getItemId()=" + getItemId() + ", getItemName()=" + getItemName()
				+ ", getItemCount()=" + getItemCount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
