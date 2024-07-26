package CollectionsClass;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsClassDemo {
	
public static void main(String[] args) {
	/*
	List<String> list = new ArrayList<String>();
	list.add("Student 1");
	list.add("Student 8");
	list.add("Student 9");
	list.add("Student 3");
	list.add("Student 4");
	list.add("Student 1");
	list.add("Student 81");
	list.add("Student 19");
	list.add("Student 1");

	
	System.out.println(list);
	Collections.sort(list);
	Collections.shuffle(list);
	Collections.rotate(list, 5);//clockwise rotate
	Collections.swap(list, 1, 4);
	Collections.replaceAll(list, "Student 3", "Student 10");
	
	System.out.println(list);
	List<String> list2 = new ArrayList<String>();
	list2.add("Student 11");
	list2.add("Student 11");
	list2.add("Student 11");
	list2.add("Student 11");
	list2.add("Student 11");
	list2.add("Student 1");
	
	Collections.copy(list2, list);
	System.out.println("List2: \n"+list2);
	
	int index=Collections.binarySearch(list, "Student 3");//work on sorted list
	System.out.println(index);
	int occurence=Collections.frequency(list, "Student 1");
	
	System.out.println(occurence);
	
	boolean flag= Collections.disjoint(list, list2);
	System.out.println(flag);
	*/
	
	Set<Integer> num= new HashSet<Integer>();
	num.add(10);
	num.add(15);
	num.add(12);
	num.add(78);
	num.add(26);
	num.add(93);
	num.add(17);
	
	int min= Collections.min(num);
	System.out.println(min);
	
	
	int max= Collections.max(num);
	System.out.println(max);
	
	System.out.println(num);
}	

}
