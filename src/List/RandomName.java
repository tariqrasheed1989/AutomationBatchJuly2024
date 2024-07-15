package List;

import java.util.HashMap;

public class RandomName {
	
	static String[] name = {"Dube Ji","Sharma Ji","Tiwari Ji"};
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> nameList= new HashMap();
		for(int i=0;i<name.length;i++) {
			nameList.put(i+1, name[i]);
		}
		
		System.out.println(nameList);
		
		String RandName=nameList.get((int)(Math.random()*name.length+1));
		System.out.println(RandName);
		
	}

}
