package seleniumA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPracties2 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/index.php");
	
	driver.findElement(By.name("email")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.id("last")).click();
	
	
	driver.findElement(By.xpath(""))
	}

}
