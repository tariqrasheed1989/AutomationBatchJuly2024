package map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap();//default
//		TreeMap<Integer, String> treeMap = new TreeMap(Comparator.reverseOrder());//Comparator
		treeMap.put(20, "A");
		treeMap.put(15, "B");
		treeMap.put(25, "C");
		treeMap.put(10, "D");
		
//		System.out.println(treeMap);

		
		Map<Integer,String> unsortedMap = new HashMap<Integer, String>();
		unsortedMap.put(2, "B");
		unsortedMap.put(1, "A");
		
		TreeMap<Integer, String> sortedMap = new TreeMap(unsortedMap);
//		System.out.println(sortedMap);
		
		SortedMap<Integer,String> sMap = new TreeMap();	
		sMap.put(1, "A");
		sMap.put(2, "B");
		
		TreeMap<Integer, String> copyMap = new TreeMap(sMap);
//		System.out.println(copyMap);
		
		
		//methods
		
//		System.out.println(treeMap.get(15));
		
//		System.out.println(treeMap.containsKey(21));
//		System.out.println(treeMap.containsValue("B"));
		
//		System.out.println(treeMap.getOrDefault(2, "nahi mila"));
		
		treeMap.forEach((key,value)->System.out.println("Key: "+key+", Value: "+value));
		treeMap.forEach((key,value)->System.out.println(key+"-> "+value));
		
	}

}
