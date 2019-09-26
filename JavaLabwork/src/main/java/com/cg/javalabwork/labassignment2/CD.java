package com.cg.javalabwork.labassignment2;

public class CD extends MediaItem {
	
	private String genre;
	private String artist;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	public CD(int itemId, String itemName, int itemCount, int runtime, String genre, String artist) {
		super(itemId, itemName, itemCount, runtime);
		this.genre = genre;
		this.artist = artist;
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
	
	

}
