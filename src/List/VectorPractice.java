package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorPractice {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.addLast("keyboard");
		v.add("fan");
		v.addElement("table");
		v.addFirst("chair");
		System.out.println(v);
		String[] newSongs= {"Song a", "Song b","Song c"};
		List<String> intialSongs = Arrays.asList(newSongs);
		
//		ArrayList<String>playlist= new ArrayList(intialSongs);
		Vector<String> playlist = new Vector<String>(intialSongs);
//		System.out.println(playlist);
//		
//		playlist.add("baddo badi");
//		playlist.add("shape of you");
		
		
		
		System.out.println(playlist);
		playlist.set(0, "shape of you");
		playlist.set(4, "Song a");
		System.out.println(playlist);
		
		System.out.println("trending at no.1 :"+playlist.get(0));
		System.out.println(playlist.capacity());
		
		playlist.add("baddo");
		playlist.add("shape of you2");
		playlist.add("baddo");
		playlist.add("shape of you2");
		playlist.add("baddo");
		playlist.add("shape of you2");
		System.out.println(playlist);
		
		System.out.println(playlist.size());
		playlist.removeAll(intialSongs);
		System.out.println(playlist);
		System.out.println(playlist.contains("baddo"));
		
		playlist.clear();
		System.out.println(playlist);
		System.out.println(playlist.isEmpty());
		
		

		
	}

}
