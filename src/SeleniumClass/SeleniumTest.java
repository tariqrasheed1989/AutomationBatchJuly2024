package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest {

	public static String browser = "chrome";//property, excel, xml
	public static WebDriver driver;
	 
	 
public static void main(String[] args) {
	
	if(browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\msedgedriver.exe");
		driver = new EdgeDriver();		
	}
	
//	driver.get("https://google.com");
	driver.navigate().to("https://google.com");
	driver.manage().window().maximize();
	Dimension target = new Dimension(1075,800);
	driver.manage().window().setSize(target);
	driver.navigate().refresh();
	driver.get("https://google.com");//refresh
	WebElement searchBox= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	searchBox.sendKeys("Selenium");
	
//	driver.close();//close the current(active) tab
//	driver.quit();//close the entire browser instance
	
}
	

}
