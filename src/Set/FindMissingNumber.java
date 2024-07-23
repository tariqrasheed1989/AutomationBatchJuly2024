package Set;

import java.util.HashSet;

public class FindMissingNumber {

	
	public static void getMissingNumbers(int[]arr, int length) {
		HashSet<Integer> AllNumbers= new HashSet();//1,2,3,4,5,6,7,8,9,10
		for(int i=1;i<=length;i++) {
			AllNumbers.add(i);
		}
		
		for(int num:arr) {
			if(AllNumbers.contains(num)) {
				AllNumbers.remove(num);
			}
		}
		
		System.out.println(AllNumbers);
	}
	public static void main(String[] args) {
		 int[] arr= {1,2,6,7,8};  
		 int length =10;
		 getMissingNumbers(arr,length);
	}
}
