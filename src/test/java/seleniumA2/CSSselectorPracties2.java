package seleniumA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorPracties2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("nikhil");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("acvf123");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		

}
}