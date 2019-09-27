package com.cg.javalabwork.labassignment2;

public abstract class Item {
	private int itemId;
	private String itemName;
	private int noOfCopies;
	private int itemCount;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, int itemCount,int noOfCopies) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCount = itemCount;
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCount=" + itemCount + "]";
	}
	
	public abstract void print();
	public void checkIn() {
		this.itemCount=0;
	}
	public void checkOut() {
		this.itemCount=0;
	}
	public void addItem(int noOfCopies) {
		this.itemCount+=noOfCopies;
		this.noOfCopies-=noOfCopies;
	}
}
