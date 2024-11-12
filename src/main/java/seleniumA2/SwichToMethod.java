package seleniumA2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class SwichToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit(); 
	}
}
