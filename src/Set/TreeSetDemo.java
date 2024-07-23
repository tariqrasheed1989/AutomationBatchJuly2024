package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		t.add("ajay");
		t.add("Vijay");
		t.add("Ramesh");
		t.add("Suresh");
		t.add("4");
//		t.add(null);
		System.out.println(t);
		
		TreeSet<Integer> num= new TreeSet();
		num.add(23);
		num.add(32);
		num.add(23);
		num.add(67);
		num.add(33);
		num.add(12);
		
		System.out.println(num);
		
//		num.pollFirst();
//		num.pollLast();

//		System.out.println(num.lower(23));
		System.out.println("Higher: "+num.higher(33));
		
//		System.out.println("Ceiling: "+num.ceiling(33));
		System.out.println("floor: "+num.floor(23));
		
		System.out.println(num);
		
//		ArrayList<Integer>list= new ArrayList(num);
//		Collections.reverse(list);
//		System.out.println(list);
		
		
		//when you compare any object with null value you get NullPointer Exception
		
	}

}
