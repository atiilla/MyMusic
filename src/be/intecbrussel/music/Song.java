package be.intecbrussel.music;

public class Song {

	private String title;
	private String artist;
	private String album;
	private int playingTime;

	public Song() {
		super();
	}

	public Song(String title, String artist, String album, int playingTime) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.playingTime = playingTime;
	}

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

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

	@Override
	public String toString() {
		return "Song [getTitle()=" + getTitle() + ", getArtist()=" + getArtist() + ", getAlbum()=" + getAlbum()
				+ ", getPlayingTime()=" + getPlayingTime() + "]";
	}

}
