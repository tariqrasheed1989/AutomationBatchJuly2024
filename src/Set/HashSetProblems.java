package Set;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HashSetProblems {
	
	public static HashSet<Integer> findCommonElement(HashSet<Integer>set1,HashSet<Integer>set2) {

		HashSet<Integer> CommonElements= new  HashSet<Integer>();
		
		for(int x:set2) {
			if(set1.contains(x)) {
				CommonElements.add(x);
			}
		}
	return CommonElements;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {2,3,5,6,5};
		HashSet<Integer> set1 = new HashSet<Integer>(IntStream.of(arr).boxed().collect(Collectors.toSet()));		
		System.out.println(set1);	
		HashSet<Integer> set2 = new HashSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(7);
		
		System.out.println(findCommonElement(set1, set2));
	}
	
	

}
