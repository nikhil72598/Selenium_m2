package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWaitPracties1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> topRestarents = driver.findElements(By.xpath(
				"//h2[text()='Top restaurant chains in Hyderabad']/ancestor::div[@class='sc-hZDyAQ dYDtEn']/descendant::div[@class='sc-aXZVg kVQudY']"));
		for (WebElement restarent : topRestarents) {
			System.out.println(restarent.getText());
		}

		Thread.sleep(2000);
		sdriver.quit();
	}

}
