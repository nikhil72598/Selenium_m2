package pomclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage login = new LoginPage();
		login.setEmail("admin");
		login.setPassword("admin");
		login.clickKeepMeLoggedIn();
		login.clickLogin();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

	

}
