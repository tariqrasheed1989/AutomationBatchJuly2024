package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map= new HashMap(20,0.80f);//80/100
		map.put(1, "Pragya");
		map.put(2, "Ishtyaque");
		map.put(3, "Tariq");//add
		map.put(4, "Prasad");
		map.put(5, "Rihan");
		map.put(6, "Ruby");
		map.put(7, "Raju");
		map.put(8, "Ram");
		map.put(9, "Raman");
		
		System.out.println(map);//20 -0.50f
		map.put(3, "New Student");
		System.out.println(map);//update
		
		System.out.println(map.get(1));
		
		map.remove(3);//remove the entire entry based on key
		System.out.println(map);
		
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Rubika"));
//		map.clear();
		System.out.println(map.isEmpty());
		map.putIfAbsent(1, "Pragya");
		map.replace(9, "Ramu");
		System.out.println(map);
		System.out.println("----iteration----");
		Set<Integer> keys=map.keySet();
		for(Integer k:keys) {
			System.out.println(k);
		}
		
		Collection<String> values= map.values();
		for(String v:values) {
			System.out.println(v);
		}
		
		
		
	}

}
