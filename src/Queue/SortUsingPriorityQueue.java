package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortUsingPriorityQueue {
	
	public static List<Integer> sortUsingPQ(int[] numb) {
		
		PriorityQueue<Integer> pq = new PriorityQueue();
		for(int n:numb) {
			pq.add(n);
		}
		
		List<Integer> sortedList= new ArrayList();
		while(!pq.isEmpty()) {
			int removedNum= pq.poll();
			sortedList.add(removedNum);
		}
		
		return sortedList;
		
	}
	
	public static void main(String[] args) {
		
		int[] numbers= {4,2,8,1,5};
		System.out.println(sortUsingPQ(numbers));
		
	}

	//array = 34,23,54,76,23,73
	//k=3; min
}
