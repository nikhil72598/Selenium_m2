package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDandNameLocatorPracties1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	   WebElement usernameTF = driver.findElement(By.id("email"));
	   usernameTF.sendKeys("muthyalanikhil763@gmail.com");
	   
	 WebElement passwordTF = driver.findElement(By.id("pass"));
	 passwordTF.sendKeys("Nikhil@123");
	 
	 WebElement loginBTN = driver.findElement(By.name("login"));
	 loginBTN.click();
	 
	 Thread.sleep(3000);
	 driver.quit();
               
	   
		        

	}

}
