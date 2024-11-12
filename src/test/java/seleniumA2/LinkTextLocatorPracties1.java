package seleniumA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocatorPracties1 {

	public static void main(String[] args) throws InterruptedException {
By driver;
driver.findElement(By.className("Forgotten password?")).click();
driver.findElement(By.id("identify_email")).sendKeys("abcedrf@gmail.com");
driver.findElement(By.name("did_submit")).click();

Thread.sleep(3000);
driver.quit();

	}

}
