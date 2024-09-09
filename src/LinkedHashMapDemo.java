import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<Integer, Integer>{
	
	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity,0.75f,true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return size()>capacity;
	}
}

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
//		LinkedHashMap<String,String> userlogin = new LinkedHashMap(3,0.75f,true);	
//		userlogin.put("user1", "login at 9:00");
//		userlogin.put("user2", "login at 10:00");
//		userlogin.put("user3", "login at 12:00");
//		
//		System.out.println("user login order: "+userlogin);
//		userlogin.put("user4",  "login at 12:00");
//		userlogin.get("user1");
//		System.out.println("user login order: "+userlogin);
		
		
		LRUCache cache = new LRUCache(3);
		cache.put(1, 10);
		cache.put(2, 20);
		cache.put(3, 30);
		
		System.out.println("cache after adding entries: "+cache);
		cache.get(1);
		cache.put(4, 40);
		
		System.out.println("cache after updating entries: "+cache);
		
	}//LRU - Least Recent Used
	
	//text - hello world hello everyone

}
