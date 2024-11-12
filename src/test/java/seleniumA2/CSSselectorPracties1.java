package seleniumA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorPracties1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcdhe@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("avgdrn123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
