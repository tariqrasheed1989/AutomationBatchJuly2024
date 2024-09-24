package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\JavaCollectionBatchJuly2024\\src\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/menu/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		List<WebElement> menuList= driver.findElements(By.cssSelector("ul#menu>li"));
		
		/*
		 <li class="ui-state-disabled ui-menu-item" aria-disabled="true"><div id="ui-id-1" tabindex="-1" role="menuitem" class="ui-menu-item-wrapper">Toys (n/a)</div></li>
		 <li class="ui-menu-item"><div id="ui-id-2" tabindex="-1" role="menuitem" class="ui-menu-item-wrapper">Books</div></li>
		 * */
//		System.out.println(menuList.size());
		for(WebElement item:menuList) {
			String attributeValue= item.getAttribute("class");
			if(!attributeValue.contains("ui-state-disabled")) {
				System.out.println(item.getText());
			}
			
		}
	}

}
