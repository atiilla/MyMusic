package be.intecbrussel.music;

import java.util.HashSet;
import java.util.Set;
public class MusicApp {

	public static void main(String[] args) {
		Set<Song> s0ngz = new HashSet<>();
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		s0ngz.add(new Song ("SongName","Artist","Album",20));
		
		for (Song song : s0ngz) {
			System.out.println(song);
		}

	}
	
	
	

}

