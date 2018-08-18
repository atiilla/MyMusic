package be.intecbrussel.music;

import java.util.ArrayList;
import java.util.List;

public class MusicCollection {

	private String name;
	private List<PlayList> playlists = new ArrayList<>();

	public MusicCollection(String name, List<PlayList> playlists) {
		super();
		this.name = name;
		this.playlists = playlists;
	}

	public void addSongToPlaylist(String playListName, Song songObject) {
		PlayList playlist = searchForPlayList(playListName);
		if(playlist!=null) {
				playlist.addSong(songObject);}
		
	}

	private PlayList searchForPlayList(String playListName) {

		for (PlayList playlist : playlists) {
			if (playlist.getName().equals(playListName)) {
				return playlist;
			}
		}
		return null;
	}

	public void removeSongFormPlaylist(String playListName, Song songObject) {
		PlayList playlist = searchForPlayList(playListName);
		if(playlist!=null) {
				playlist.removeSong(songObject);
			}
		}
	

	public void addPlayList(PlayList playlistObject) {
		playlists.add(playlistObject);
	}

	public void removePlayList(PlayList playlistObject) {
		playlists.remove(playlistObject);
	}

	public int countOfPlaylistsInCollection() {
		return playlists.size();
	}

	public int countOfSongsInPlayList(String playlistName) {
		PlayList playlist = searchForPlayList(playlistName);
		if(playlist!=null) {
				return playlist.countOfPlayList();
			}
		
		return 0;
	}

	public void displayPlayListsInCollection() {
		for (PlayList playlist : playlists) {
			System.out.println(playlist);
		}
	}
	public void displaySongsFromPlaylist(String playlistName) {
		PlayList playlist = searchForPlayList(playlistName);
		if (playlist != null) {
			playlist.displayPlaylist();
		}
	}

}
