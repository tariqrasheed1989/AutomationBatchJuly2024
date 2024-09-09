package map;

import java.util.Hashtable;

public class HashtableDemo {
	
	public static void main(String[] args) {
		
		Temp t = new Temp(5);
		System.out.println(t);
		
		Hashtable h=new Hashtable();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		
		System.out.println(h);
	}

}

class Temp{
	
	int i;
	
	public Temp(int i) {
		this.i= i;
	}
	
	public int hashCode() {
		return i%9;
	}
	
	public String toString() {
		return i+"";
	}
}
