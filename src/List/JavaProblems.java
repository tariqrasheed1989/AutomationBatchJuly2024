package List;

import java.util.ArrayList;

public class JavaProblems {
	
	public static void getVowels(String str) {//12-07-2024
		char[] arr= str.toCharArray();
		ArrayList<Character>list= new ArrayList();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 'a'||arr[i] == 'e'||arr[i] == 'i'||arr[i] == 'o'||arr[i] == 'u') {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		//input = india, output - iia 
		getVowels("india");
		
	}

}
