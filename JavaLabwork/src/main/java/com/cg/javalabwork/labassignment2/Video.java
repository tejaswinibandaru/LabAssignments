package com.cg.javalabwork.labassignment2;

public class Video extends MediaItem {
	
	private String director;
	private int releasedYear;
	private String genre;
	
	public Video() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Video(int itemId, String itemName, int itemCount, int runtime, String director, int releasedYear,
			String genre) {
		super(itemId, itemName, itemCount, runtime);
		this.director = director;
		this.releasedYear = releasedYear;
		this.genre = genre;
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
