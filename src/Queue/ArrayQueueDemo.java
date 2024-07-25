package Queue;

import java.util.ArrayDeque;

public class ArrayQueueDemo {
	
	//Stack - LIFO
	//Queue - FIFO 
	//ArrayDeque
	
	public static void main(String[] args) {
		
		ArrayDeque<String> dq= new ArrayDeque<String>();
//		dq.addFirst("Chair");//Exception
//		dq.addFirst("Pen");
//		dq.addFirst("Fan");
//		dq.add("bulb");
//		dq.add("switch");
//		dq.add("light");
//		dq.offerFirst("windows");//null
//		dq.offerFirst("linux");
//		dq.offerFirst("dos");
//		
//		
//		System.out.println(dq);
		
		//use ArrayDequeu as Stack
		//
		
		dq.offer("Alice");
		dq.offer("Bob");
		dq.offer("Marry");
		System.out.println("Queue: "+dq);
		String name= dq.poll();//remove first in the queue - FIFO
		System.out.println(name);
		System.out.println(dq);
		
		
	}
	

}
