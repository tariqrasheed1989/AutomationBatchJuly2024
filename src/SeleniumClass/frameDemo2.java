package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		String msg= driver.findElement(By.id("demo")).getText();
		System.out.println(msg);
		
	}

}
