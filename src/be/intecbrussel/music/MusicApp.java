package be.intecbrussel.music;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MusicApp {

	public static void main(String[] args) {

		Song song1 = new Song("SongName1", "Artist1", "Album", 20);
		Song song3 = new Song("SongName3", "Artist3", "Album", 20);
		Song song2 = new Song("SongName2", "Artist2", "Album", 20);
		Song song4 = new Song("SongName4", "Artist4", "Album", 20);

		PlayList playlist1 = new PlayList("PlayList Name");
		playlist1.addSong(song1);
		playlist1.addSong(song2);
		playlist1.addSong(song3);
		playlist1.addSong(song4);

		playlist1.displayPlaylist();

		playlist1.displayPlaylist();

		System.out.println("sorting by song name");
		playlist1.sortyByName();

		playlist1.displayPlaylist();

		Comparator<Song> artistNameComparator = new Comparator<Song>() {

			@Override
			public int compare(Song song1, Song song2) {
				String artist1 = song1.getArtist();
				String artist2 = song2.getArtist();

				return artist1.compareTo(artist2);
			}
		};

		System.out.println("sorting by artist name");
		playlist1.sort(artistNameComparator);
		playlist1.displayPlaylist();

	}

}
