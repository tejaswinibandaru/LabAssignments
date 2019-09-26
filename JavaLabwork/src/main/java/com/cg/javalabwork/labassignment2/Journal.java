package com.cg.javalabwork.labassignment2;

public class Journal extends WrittenItem {
	
	private int publishedYear;
	
	public Journal() {
		// TODO Auto-generated constructor stub
	}
	

	public Journal(int itemId, String itemName, int itemCount, String author) {
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
		return "Journal [publishedYear=" + publishedYear + ", getAuthor()=" + getAuthor() + ", toString()="
				+ super.toString() + ", getItemId()=" + getItemId() + ", getItemName()=" + getItemName()
				+ ", getItemCount()=" + getItemCount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
