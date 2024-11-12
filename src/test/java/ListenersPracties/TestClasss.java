package ListenersPracties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


Listeners(ListenersPracties.ListenersImplimentation)
public class TestClasss extends BaseClass {
@Test
public void testMethod1() {
	Reporter.log("@Test1",true);
	Assert.fail();
	
	}
@Test(dependsOnMethods = "testMethod1")
public void testMethod2() {
	Reporter.log("@Test2",true);
}
}
