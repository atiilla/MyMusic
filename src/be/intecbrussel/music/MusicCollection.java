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

	public void addSongToPlayList(String playListName, Song song) {
		PlayList playlist = searchForPlayList(playListName);
		if(playlist!=null) {
			
		}
		
	}

	private PlayList searchForPlayList(String playListName) {
		for (PlayList playList : playlists) {
			if(playList.getName().equals(playListName)) {
				return playList;
			}
		}
		return null;
	}

	public void removeSongFromPlayList(String playListName, Song song) {
		PlayList playlist = searchForPlayList(playListName)
		for (PlayList playList : playlists) {
			if(playList.getName().equals(playListName)) {
				playList.removeSong(song);
			}
		}

	}

	public void addPlayList(PlayList playList) {
		
		playlists.add(playList);

	}

	public void removePlayList(PlayList playList) {
		playlists.remove(playList);
	}

	public int countOfPlaylistsInCollection() {
		
		return playlists.size();

	}

	public int countsOfSongInPlayList(String playlistName) {
		PlayList playlist = searchForPlayList(playlistName);
		if(playlist!=null) {
			return playlist.countOfPlaylist();
		}
		return 0;
		
		}
		

	

	public void diplayPlayListsInCollection() {
		for (PlayList playList : playlists) {
			System.out.println(playList);
		}
	}
	public void displaySongsFromPlaylist(String playlistName) {
		for (PlayList playList : playlists) {
			if(playList.getName().equals(playlistName)) {
				playList.addSong(song);
			}
		}
		

	}

}
