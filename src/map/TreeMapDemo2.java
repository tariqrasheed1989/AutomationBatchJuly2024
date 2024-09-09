package map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap();
		map.put(1, "A");
		
		TreeMap<Integer, String> tm = new TreeMap(map);
		tm.put(11, "Apple");
		tm.put(20, "Orange");
		tm.put(3, null);
		
		System.out.println(tm);
		
		
		System.out.println(tm.getOrDefault(12, "Not found"));
		
//		tm.forEach((key,value)->System.out.println(value+"=>"+key));
		
		for(Map.Entry<Integer, String> entry:tm.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
	}

}
