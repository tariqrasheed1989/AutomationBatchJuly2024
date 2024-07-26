package Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class getTop3elements {
	
	 public static void main(String[] args) {
		
		 int k=4;//Comparator.reverseOrder
		 PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Arrays.asList(10,4,24,5,7));
		 System.out.println(pq);
		 for(int i=0;i<k;i++) {
			 System.out.println(pq.poll());
			 
		 }
		 
	}

}
