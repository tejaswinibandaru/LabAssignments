package com.cg.javalabwork.labassignment2;

public abstract class MediaItem extends Item {
	
	private int runtime;
	
	public MediaItem() {
		// TODO Auto-generated constructor stub
	}
	
	

	public MediaItem(int itemId, String itemName, int itemCount, int runtime) {
		super(itemId, itemName, itemCount);
		this.runtime = runtime;
	}


	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", getItemId()=" + getItemId() + ", getItemName()=" + getItemName()
				+ ", getItemCount()=" + getItemCount() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
