package seleniumA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameLocatorPracties1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone 16 pro max");
		driver.findElement(By.className("_2iLD_")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
