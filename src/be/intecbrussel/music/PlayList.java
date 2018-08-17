package be.intecbrussel.music;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class PlayList {

	private String name;
	private List<Song> songs = new ArrayList<Song>();

	public PlayList() {
		this("");
	}

	public PlayList(String name) {
		super();
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public void addSong(Song song) {
		songs.add(song);
	}

	public void removeSong(Song song) {
		songs.remove(song);
	}

	public int countOfPlaylist() {
		return songs.size();

	}

	public void displayPlaylist() {
		for (Song song : songs) {
			System.out.println(song);
		}
	}

	public void sortByName() {
		songs.sort(new Comparator<Song>() {

			@Override
			public int compare(Song song1, Song song2) {
				// anonymous nested class
				String song1_title = song1.getTitle();
				String song2_title = song2.getTitle();
				return song1_title.compareTo(song2_title);
			}
			
		});

	}

	public void sortByplayingtime() {}

	public void sort(Comparator<Song> customSongComparator) {
	}
	
	public class PlayingTimeComparator implements Comparator<Song>{

		@Override
		public int compare(Song song1, Song song2) {
			return ((Integer)song1.getPlayingTime()).compareTo(song2.getPlayingTime());
		
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((songs == null) ? 0 : songs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (songs == null) {
			if (other.songs != null)
				return false;
		} else if (!songs.equals(other.songs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayList [getName()=" + getName() + ", getSongs()=" + getSongs() + ", countOfPlaylist()="
				+ countOfPlaylist() + "]";
	}
	
	

}
