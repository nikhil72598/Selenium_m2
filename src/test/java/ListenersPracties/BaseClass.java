package ListenersPracties;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void Suiteconfig()
	{
		Reporter.log("@BeforeSuite", true);
	}
@BeforeTest
public void Testconfig()
{
	Reporter.log("@BeforeTest",true);
	
}
@BeforeClass
public void Classconfig()
{
	Reporter.log("@BeforeClass",true);
	
}
@BeforeMethod
public void Methodconfig()
{
	Reporter.log("@BeforeMethod",true);
}
@AfterMethod

	public void Methodconfig() {
	Reporter.log("@AfterMethod",true);
}
@AfterClass
public void Classconfig() {
	Reporter.log("@AfterClass",true);
}
@AfterTest
public void Testconfig() {
	Reporter.log("@AfterTest",true);
}
@AfterSuite
public void Suiteconfig() {
	Reporter.log("@AfterSuite",true);
}
}
	