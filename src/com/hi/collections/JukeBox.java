package com.hi.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JukeBox implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] s){
		new JukeBox().go();
	}
	class ArtistCompare implements Comparator<Song>{
		public int compare(Song one, Song two){
			//System.out.println(one.artist+" ,"+two.artist);
			return one.artist.compareTo(two.artist);
		}
	}
	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		//ArtistCompare am = new ArtistCompare();
	//	Collections.sort(songList, am);
	//	System.out.println(songList);
		Set<Song> songsSet = new HashSet<Song>();
		songsSet.addAll(songList);
		System.out.println(songsSet);
	}
	
	public void getSongs(){
		try{
			File file = new File("SongList.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line = null;
			while( (line = bf.readLine()) != null){
				addSong(line);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	void addSong(String line){
		String[] tokens = line.split("/");
		Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		System.out.println("hashCode==="+nextSong);
		songList.add(nextSong);
	}
}
