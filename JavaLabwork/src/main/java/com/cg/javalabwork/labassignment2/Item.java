package com.cg.javalabwork.labassignment2;

public abstract class Item {
	private int itemId;
	private String itemName;
	private int itemCount;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, int itemCount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCount = itemCount;
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
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
}
