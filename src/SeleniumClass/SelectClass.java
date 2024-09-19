package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropDown=driver.findElement(By.cssSelector("select#dropdown-class-example"));
		
		
		Select select = new Select(dropDown);
//		select.selectByIndex(3);
//		select.selectByValue("option2");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Option2");
		
		WebElement option3= driver.findElement(By.cssSelector("option[value='option3']"));
		System.out.println(option3.isSelected());
		System.out.println(select.getFirstSelectedOption().getText());
		System.out.println("Multiple Selection: "+select.isMultiple());
		
		driver.quit();
		
		
	}

}
