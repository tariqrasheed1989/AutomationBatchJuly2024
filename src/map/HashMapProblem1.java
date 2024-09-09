package map;

import java.util.HashMap;

public class HashMapProblem1 {
	
	public static void getFrequency(String str) {
		
		char[] ch= str.toCharArray();//{a,b,r,a,k,a}
		HashMap<Character,Integer> counter = new HashMap();//a= 4,b=2
		
		for(char x:ch) {//a
			if(counter.containsKey(x)) {//
				counter.put(x, counter.get(x)+1);//(a,3)
				
			}else {
				
				counter.put(x, 1);//a=2,b=1, r=1, k=1,
			}
		}
		System.out.println(counter);
	}
	
	
	public static void main(String[] args) {
		String word = "abrakadabra";
		getFrequency(word);
	}

}
