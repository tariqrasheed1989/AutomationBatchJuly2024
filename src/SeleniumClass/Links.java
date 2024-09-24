package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Links = tag ->a (called as anchor tag)
		
//		WebElement elements= driver.findElement(By.tagName("a"));
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total links of this page: "+links.size());
		
		for(WebElement link:links) {
			
			System.out.println(link.getAttribute("href"));
		}
		
		List<WebElement> footerLinks= driver.findElements(By.xpath("//div[@id='gf-BIG'] //a"));

		System.out.println("Total links on footer: "+footerLinks.size());
		
		for(WebElement link:footerLinks) {
//			System.out.println(link.getText());
			String name= link.getText();
			
			if(name.equals("REST API")) {
				link.click();
				System.out.println(driver.getTitle());
			}
			
		}
		
//		driver.findElement(By.xpath("//div[@id='gf-BIG'] //a[text()='REST API']")).click();
		
		
		
	}

}
