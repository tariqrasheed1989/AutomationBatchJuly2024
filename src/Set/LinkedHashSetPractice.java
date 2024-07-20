package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	
	public static void main(String[] args) {
		
/*		LinkedHashSet<Integer> set1= new LinkedHashSet(20,0.50f);//75%
		
		//10 - 
		//set1 -order - user1, user2, user3 - 100000orders
		
		LinkedHashSet<String> students = new LinkedHashSet<String>();
		students.add("Anil");
		students.add("Ibrahim");
		students.add("Suraj");
		students.add("Pooja");
		
		System.out.println("Registered Students yet: "+students);
		students.remove("Pooja");		
		System.out.println("Please enter the name.");
		
		Scanner sc = new Scanner(System.in);
		String name= sc.next();

		
		if(students.contains(name)) {
			System.out.println(name+" is already registered");
		}else {
			students.add(name);
			System.out.println("Name is added to Students list");
			System.out.println(students);
		}
		
		
		students.clear();
		System.out.println(students.isEmpty());
	*/	
		
		//string = abracadabra
		//output - abrcd
		//find out unique characters in the same order it entered
		String input = "abracadabra";
		char[] chars= input.toCharArray();
		LinkedHashSet<Character> uniqueChars= new LinkedHashSet<Character>();
		for(char ch:chars) {
			uniqueChars.add(ch);
		}
		
		System.out.println(uniqueChars);
//		for(Character x:uniqueChars) {
//			System.out.println(x);
//		}
		
		Iterator<Character> it= uniqueChars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	//remove duplicate values from a list
	//list.add()  - 4,5,6,7,84,32,2,5,4
	//print unique values
	
	//array int[] arr = {1,2,6,7,8}; length = 10
	//find out missing numbers
	//output = 3,4,5,9,10
	
	
	//a= 10
	//b=6;
	//output 
	//a=6
	//b = 10
	//swap 2 numbers without using temp or 3rd variable

}
