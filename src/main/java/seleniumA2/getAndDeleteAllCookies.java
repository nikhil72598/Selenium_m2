package seleniumA2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class getAndDeleteAllCookies {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 System.out.println("************Getting cookies *******");
		 Set<Cookie> cookies = driver.manage().getCookies();
		 for(Cookie cookie : cookies) {
			 System.out.println(cookie.getName()+"\t"+cookie.getDomain()+"\t"+ cookie.getExpiry());
		 }
		 
		 Thread.sleep(3000);
		 System.out.println("******Deleting cookies*****");
		 driver.manage().deleteAllCookies();
		 cookies = driver.manage().getCookies();
		 for(Cookie cookie : cookies) {
			 System.out.println(cookie.getName()+"\t"+cookie.getDomain()+"\t"+ cookie.getExpiry());
	}
driver.quit();
	}
}
