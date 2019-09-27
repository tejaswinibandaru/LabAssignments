package com.cg.javalabwork.labassignment2;

public class CD extends MediaItem {
	
	private String genre;
	private String artist;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	public CD(int itemId, String itemName, int itemCount, int runtime,int noOfCopies, String genre, String artist) {
		super(itemId, itemName, itemCount, runtime, noOfCopies);
		this.genre = genre;
		this.artist = artist;
	}
	
	
	@Override
	public String toString() {
		return "CD [genre=" + genre + ", artist=" + artist + ", getGenre()=" + getGenre() + ", getArtist()="
				+ getArtist() + ", toString()=" + super.toString() + ", getNoOfCopies()=" + getNoOfCopies()
				+ ", getItemId()=" + getItemId() + ", getItemName()=" + getItemName() + ", getItemCount()="
				+ getItemCount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}	

}
