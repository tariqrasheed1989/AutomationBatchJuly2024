package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetPractice {
	
	//Hashing - .add ("ac") - abc  - id 
	//set.add(1); - hash value - HashMap
	//set - print = 1
	//jumpled - a,d,b,c,d,e
	//
	
	//customers = a,b,a,t,h,a=
	//a,b,t,h
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet();
		hs.add(34);
		hs.add(67);
		hs.add(1);
		hs.add(7);
		hs.add(5);
		hs.add(31);	
		System.out.println(hs); //multiples 
		//Thread - insta
		
		if(hs.add(1)) {
			System.out.println("account created successfully");
		}else {
			System.out.println("already exist");
		}
		
//		String [] values = {"india","China","Japan","China"};
//		
//		HashSet<String> unique = new HashSet<String>(Arrays.asList(values));
//		System.out.println(unique);
		
		hs.removeIf(value->value>50);//
		
		System.out.println(hs);
		
		System.out.println(hs.contains(17));
		
	}
	
	//array 1 = {1,2,3,4,5}
	//array2 = {3,4,5,6,7};

//	common values - output {3,4,5};
	//has set
}
