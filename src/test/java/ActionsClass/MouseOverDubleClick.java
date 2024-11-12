package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDubleClick {

	public static void main(String[] args) {
		c
		
		WebElement courseTab = driver.findElement(By.id("course"));
		Actions action = new Actions(driver);
		action.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='Selenium']")).click();
		
		WebElement quantity = driver.findElement(By.id("quantity"));
		int initialvalue = Integer.parseInt(quantity.getAttribute("value"));
		
		WebElement pluseBTN = driver.findElement(By.id("add"));
		action.doubleClick(pluseBTN).perform();
		
		int finalvalue = Integer.parseInt(quantity.getAttribute("value"));
		
		if(initialvalue+1 == finalvalue)
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();
		
	}

}
