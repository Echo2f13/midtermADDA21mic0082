package my-response;

import org.testng.annotations.*;
import org.junit.Assert;
import org.testng.asserts.*;

public class Apptest {
@Test
	public void logintest1()
	{
		App obj = new App();
		Assert.assertEquals( 0 , obj.login("ram ","3025"));
	}
@Test
	public void logintest2()
	{
		App obj1 = new App();
		Assert.assertEquals( 1 , obj1.login("ram","3025"));
	}
}