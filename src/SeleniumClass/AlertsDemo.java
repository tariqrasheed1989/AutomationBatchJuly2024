package SeleniumClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsDemo {
	
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
//		WebElement alertBox=driver.findElement(By.id("alertBox"));
//		alertBox.click();		
//		driver.switchTo().alert().accept();//okay
		
		
//		Thread.sleep(3000l);
//		WebElement confirmBox=driver.findElement(By.cssSelector("button#confirmBox"));
//		confirmBox.click();
//		Thread.sleep(3000l);
//		String alertMsg= driver.switchTo().alert().getText();
//		driver.switchTo().alert().dismiss();//cancel
//		System.out.println("Confirm Box msg:"+alertMsg);
		
//		WebElement promptBox= driver.findElement(By.id("promptBox"));
//		promptBox.click();
//		
//		Alert alert= driver.switchTo().alert();
//		Thread.sleep(2000l);
//		System.out.println(alert.getText());
//		try {
//		alert.sendKeys("abc");
//		}catch(Exception e) {
//			//javascript executor
//		}
//		Thread.sleep(2000l);
//		alert.accept();
//		driver.quit();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='See a sample prompt']"))));
		WebElement prompt= driver.findElement(By.xpath("//a[text()='See a sample prompt']"));
		js.executeScript("arguments[0].click();", prompt);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();		
//		driver.switchTo().alert().dismiss();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
	}

}
