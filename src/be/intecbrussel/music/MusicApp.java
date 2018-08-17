package be.intecbrussel.music;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.TreeMap;
public class MusicApp {

	public static void main(String[] args) {
		
		Song song1 = new Song ("SongName1","Artist1","Album",20);
		Song song2 = new Song ("SongName2","Artist2","Album",20);
		Song song3 = new Song ("SongName3","Artist3","Album",20);
		Song song4 = new Song ("SongName4","Artist4","Album",20);
		
		PlayList playlist1 = new PlayList("PlayList Name");
		playlist1.addSong(song1);
		playlist1.addSong(song2);
		playlist1.addSong(song3);
		playlist1.addSong(song4);
		
		playlist1.displayPlaylist();
		
		
		System.out.println("\\ sortByName\n ");
		
		
		System.out.println("\\ countOfPlaylist : " + playlist1.countOfPlaylist());
		
		

	}
	
	
	

}

