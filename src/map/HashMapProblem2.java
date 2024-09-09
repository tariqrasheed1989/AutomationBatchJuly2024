package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapProblem2 {
	
	public static List<Character> removeDuplicates(String str) {
		HashMap<Character,Integer> counter = new HashMap();
		List<Character> list= new ArrayList();
		char[] ch= str.toCharArray();
		
		for(char x:ch) {
			if(counter.containsKey(x)) {
				counter.put(x, counter.get(x)+1);
				
			}else {
				counter.put(x, 1);
			}
		}
		
		System.out.println(counter);
		
		for(Map.Entry<Character,Integer> entry:counter.entrySet()) {
			if(entry.getValue()==1) {
				list.add(entry.getKey());
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		String word ="indian";//da
		List<Character> list= removeDuplicates(word);
		System.out.println(list);
	}
	
	//indianaoccean = >=2 -

}
