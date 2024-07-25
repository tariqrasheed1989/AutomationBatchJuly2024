package Queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);//min - highest
	}
	
}

public class PriorityQueueDemo {
	
	
	public static void main(String[] args) {
		/*
		PriorityQueue<Integer> pq=new PriorityQueue(Comparator.reverseOrder());
		pq.add(34);
		pq.add(12);
		pq.offer(56);
		pq.offer(9);
		System.out.println(pq);
		
		System.out.println("Next Number: "+pq.peek());
		int pickedNum=pq.poll();
		System.out.println(pickedNum);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		System.out.println(pq.element());//same as peek();
		
		System.out.println(pq.contains(56));
//		pq.clear();
		System.out.println(pq.size());
//		pq.add(null);//will not accept
		pq.add(67);
		pq.add(7);
		pq.add(27);
		pq.add(61);
		
		Iterator<Integer> it= pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		*/

		PriorityQueue<String> q=new PriorityQueue<String>(new MyComparator());
		q.add("Ramesh");
		q.add("Suresh");
		q.add("Madan");
		q.add("Shoaib");
		q.add("Farooq");
		
		System.out.println(q);
		System.out.println("Next: "+q.peek());
		q.poll();
		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}
	


}
