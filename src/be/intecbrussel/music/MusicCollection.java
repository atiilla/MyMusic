package be.intecbrussel.music;

public class MusicCollection {

	private String muzikCollection;
	private String playListsinMusicCollection;
	private Song song;

	public MusicCollection() {
		super();
	}

	public MusicCollection(String muzikCollection, String playListsinMusicCollection) {
		super();
		this.muzikCollection = muzikCollection;
		this.playListsinMusicCollection = playListsinMusicCollection;
	}

	public void addSongToPlayList(String playListName, Song songObj) {

	}

	public void removeSongFromPlayList(String playListName, Song songObj) {

	}

	public void addPlayList(PlayList playlistObj) {

	}

	public void removePlayList(PlayList playlistObj) {

	}

	public int countOfPlaylistsInCollection() {
		return 0;

	}

	public int countsOfSongInPlayList(String playlistName) {
		return 0;

	}

	public void displaySongsFromPlaylist(String playlistName) {

	}

}
