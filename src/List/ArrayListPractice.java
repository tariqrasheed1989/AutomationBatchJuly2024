package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractice {
	public static void main(String[] args) {

		/*
		 * int [] arr = new int[6];//homogenous arr[0] = 10; arr[1] = 17; arr[2] = 14;
		 * arr[3] = 56; arr[4] = 11; arr[5] = 45;
		 * 
		 * for(int x:arr) {//advance for loop`for(dataType varible:array)
		 * System.out.println(x); }
		 * 
		 * ArrayList list = new ArrayList();//heterogenous --by default -10
		 * list.add(10);//int list.add("abc");//string list.add('c');//char
		 * list.add(345.7f); list.add(10);//int list.add("abc");//string
		 * list.add('c');//char list.add(345.7f); list.add(10);//int
		 * list.add("abc");//string list.add('c');//char list.add(345.7f);
		 * 
		 * System.out.println(list);
		 */
		
//		ArrayList list=new ArrayList();
//		list.add(45);
//		list.add(67);
//		list.add(78);
//		list.add(45);
//		list.add(90);)
		
//		System.out.println(list);
//		
//		System.out.println(list.get(2));
//		System.out.println(list.size());
		

		/*
		 * ArrayList li=new ArrayList(5);//10 li.add(123); li.add(76); li.add(231);
		 * li.add(11);
		 * 
		 * 
		 * ArrayList list2=new ArrayList();//10 list2.add(23); list2.add("abc");
		 * list2.add("xyz"); list2.addAll(li); list2.add(null);
		 * 
		 * 
		 * list2.removeAll(li);
		 * 
		 * // System.out.println(list2); list2.remove(null);
		 * 
		 * // System.out.println(list2); list2.remove(list2.indexOf(23));
		 * System.out.println(list2);
		 */
	
		ArrayList<Integer> data= new ArrayList<>();
		data.add(565);
		data.add(55);
		data.add(65);
		data.add(650);
		data.add(500);
		data.add(null);
		data.add(null);
		
//remove null
		
		data.removeAll(Arrays.asList((String)null));
		System.out.println(data);
		
//		
//		data.add(3, 4354);
//		
//		System.out.println(data);
//		data.set(3, 435);
//		System.out.println(data);
//		System.out.println(data.isEmpty());
//		System.out.println(data.contains(55));
//		data.clear();
//		System.out.println(data);
		


		
//		for(int i=0;i<data.size();i++) {
//			if(data.get(i) == null) {
//				data.remove(data.get(i));
//			}
//		}
		
		System.out.println(data);
		
//		Iterator it= data.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}
