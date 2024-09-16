package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://google.com");
		
		/*		
		ID
		Name
		tagName
		ClassName
		LinkText
		PartialText
		CSS Selector
		XPath		
		 * */
//		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
//		driver.findElement(By.linkText("Gmail")).click();
		
		driver.get("https://en.wikipedia.org/wiki/Constitution_of_India");
		
		driver.findElement(By.partialLinkText("fundamental")).click();
		
		driver.findElement(By.tagName("input"));
		
		
	}

}
