package com.hi.collections;

public class Song implements Comparable<Song>{
	String title;
	String artist;
	String bpm;
	String rating;

	Song(String t, String a, String r, String b){
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	@Override
	public int compareTo(Song o) {
		return title.compareTo(o.title);
	}

	/*public String toString(){
		return title + ":" +artist;
	}*/
	/*public String toString(){
		return title;
	}*/
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getBpm() {
		return bpm;
	}

	public void setBpm(String bpm) {
		this.bpm = bpm;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	

}
