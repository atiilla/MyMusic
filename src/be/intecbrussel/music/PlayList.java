package be.intecbrussel.music;

import java.util.Comparator;

public class PlayList implements Comparator<Song>{

	private String playList;
	private String Songs;

	public PlayList() {
		super();
	}

	public PlayList(String playList, String songs) {
		super();
		this.playList = playList;
		Songs = songs;
	}

	public String getPlayList() {
		return playList;
	}

	public void setPlayList(String playList) {
		this.playList = playList;
	}

	public String getSongs() {
		return Songs;
	}

	public void setSongs(String songs) {
		Songs = songs;
	}

	public void addSong(Song songObj) {

	}

	public void removeSong(Song songObj) {

	}

	public int countOfPlaylist() {
		return 0;

	}

	public void displayPlaylist() {

	}

	@Override
	public String toString() {
		return "PlayList [getPlayList()=" + getPlayList() + ", getSongs()=" + getSongs() + ", countOfPlaylist()="
				+ countOfPlaylist() + "]";
	}

	public void sortByName() {

	}

	public void sortByplayingtime() {

	}

	public void sort(Comparator<Song> customSongComparator) {

	}

	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Songs == null) ? 0 : Songs.hashCode());
		result = prime * result + ((playList == null) ? 0 : playList.hashCode());
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
		if (Songs == null) {
			if (other.Songs != null)
				return false;
		} else if (!Songs.equals(other.Songs))
			return false;
		if (playList == null) {
			if (other.playList != null)
				return false;
		} else if (!playList.equals(other.playList))
			return false;
		return true;
	}
}
