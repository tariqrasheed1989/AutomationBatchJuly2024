package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrameDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");//top
		driver.switchTo().frame("frame-left");//left
		String left= driver.findElement(By.tagName("body")).getText();
		System.out.println(left);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");//middle		
		String middle= driver.findElement(By.tagName("body")).getText();
		System.out.println(middle);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");//middle		
		String right= driver.findElement(By.tagName("body")).getText();
		System.out.println(right);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().frame("frame-bottom");//bottom		
		String bottom= driver.findElement(By.tagName("body")).getText();
		System.out.println(bottom);
		
		
		
	}

}
