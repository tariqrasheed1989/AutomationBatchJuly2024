package WebDrivers;

public class Child extends ParentClass{
	
	public void getchild() {
		System.out.println("demo");
		
	}
	
	public void get() {
		System.out.println("child get method");
	}
	
	public static void main(String[] args) {
		
		ParentClass ch = new Child();
		ch.get();
		ch.send();
//		ch.getchild();
		
	}

}
