package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo2 {

	public static void main(String[] args) {
		Hashtable<String, Integer> h = new Hashtable();
		h.put("A", 1);
		h.put("B", 11);
		h.put("C", 6);
		
		int value=(int) h.get("C");
		System.out.println(value);
		
		Hashtable<String, Integer> ht = new Hashtable(h);
		ht.put("X", 1);
		ht.put("Y", 11);
		ht.put("Z", 6);
		
		System.out.println(ht);
		
//		for(Map.Entry<String, Integer> entry:ht.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
//		for(Object entry:ht.entrySet()) {
//			Map.Entry ent= (Map.Entry)entry;
//			
//			System.out.println(ent.getKey()+":"+ent.getValue());
//		}
		
		Enumeration<String> keys= ht.keys();
		while(keys.hasMoreElements()) {
			String key= keys.nextElement();
			System.out.println(key+":"+ht.get(key));
		}
		
	
	}
	
}
