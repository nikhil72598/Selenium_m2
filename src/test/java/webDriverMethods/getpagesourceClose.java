package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getpagesourceClose {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://goole.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();

	}

}
