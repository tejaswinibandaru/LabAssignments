package com.cg.javalabwork.labassignment2;

public abstract class WrittenItem extends Item{
	private String author;
	
	public WrittenItem() {
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(int itemId, String itemName, int itemCount, String author) {
		super(itemId, itemName, itemCount);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", getAuthor()=" + getAuthor() + ", getItemId()=" + getItemId()
				+ ", getItemName()=" + getItemName() + ", getItemCount()=" + getItemCount() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
