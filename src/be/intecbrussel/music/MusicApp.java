package be.intecbrussel.music;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.TreeMap;
public class MusicApp {

	public static void main(String[] args) {
		Collection<Song> s0ngz = new HashSet<>();
		
		PlayList playlist = new PlayList();
		playlist.addSong(new Song ("SongName","Artist","Album",20));
		
		System.out.println(playlist);
		
		
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		
		for (Song song : s0ngz) {
			System.out.println(song);
		}

	}
	
	
	

}

