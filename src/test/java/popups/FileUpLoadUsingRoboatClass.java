package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpLoadUsingRoboatClass {

	

	public static  void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/creatAcount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		driver.findElement(By.className("UploadResume")).click();
		Thread.sleep(2000);
		StringSelection str = new StringSelection("C:\\Users\\Lenovo\\Downloads\\NIKHIL _11zon.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
