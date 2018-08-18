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
	
	public void addSong(Song song) {
		songs.add(song);
	}
	public void removeSong(Song song) {
		songs.remove(song);
	}
	public int countOfPlayList() {
		return songs.size();
		
	}
	public void displayPlaylist() {
		for (Song song : songs) {
			System.out.println(song);
		}
	}
	
	@Override
	public String toString() {
		return "Playlist [name=" + name + ", number of songs=" + countOfPlayList() + "]";
	}

	public void sortyByName() {
		songs.sort(new Comparator<Song>() {

			@Override
			public int compare(Song song1, Song song2) {
				String title1 = song1.getTitle();
				String title2 = song2.getTitle();
				
				return title1.compareTo(title2);
			}
		});
		
	}
	
	public void sortByPlayingTime() {
		songs.sort(new PlayingTimeComparator());
		
	}
	public void sort(Comparator<Song> customSongComparator) {
		songs.sort(customSongComparator);
	}
	
	public class PlayingTimeComparator implements Comparator<Song>{

		@Override
		public int compare(Song song1, Song song2) {
			int playingTime1 = song1.getPlayingTime();
			int playingTime2 = song2.getPlayingTime();
			return playingTime1 - playingTime2;
		}
		
	}
}