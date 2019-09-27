package com.cg.javalabwork.labassignment2;

public class Video extends MediaItem {
	
	private String director;
	private int releasedYear;
	private String genre;
	
	public Video() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Video(int itemId, String itemName, int itemCount, int runtime,int noOfCopies, String director, int releasedYear,
			String genre) {
		super(itemId, itemName, itemCount, runtime,noOfCopies);
		this.director = director;
		this.releasedYear = releasedYear;
		this.genre = genre;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
	}


	@Override
	public String toString() {
		return "Video [director=" + director + ", releasedYear=" + releasedYear + ", genre=" + genre + ", toString()="
				+ super.toString() + ", getNoOfCopies()=" + getNoOfCopies() + ", getItemId()=" + getItemId()
				+ ", getItemName()=" + getItemName() + ", getItemCount()=" + getItemCount() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
