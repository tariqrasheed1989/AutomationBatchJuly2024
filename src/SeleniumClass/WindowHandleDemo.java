package SeleniumClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> windows= driver.getWindowHandles();
		
		String parent= driver.getWindowHandle();
		Iterator<String> windowID= windows.iterator();
		String parent1= windowID.next();
		String child= windowID.next();
		
//		for(String ID:windows) {
//			System.out.println(ID);
//		}
		
		driver.switchTo().window(child);		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys("test123");
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
