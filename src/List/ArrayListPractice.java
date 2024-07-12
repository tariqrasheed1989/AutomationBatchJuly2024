package List;

import java.util.ArrayList;

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
		
		ArrayList list=new ArrayList();
		list.add(45);
		list.add(67);
		list.add(78);
		list.add(45);
		list.add(90);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		
	}

}
