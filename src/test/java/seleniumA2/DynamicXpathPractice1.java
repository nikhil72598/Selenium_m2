package seleniumA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.className("_2iLD_")).click();
		
	 WebElement mobiles = driver.findElement(By.className("KzDlHZ"));
		
		
	}

}
