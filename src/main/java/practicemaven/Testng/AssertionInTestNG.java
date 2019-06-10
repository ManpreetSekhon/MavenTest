package practicemaven.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
// dataprovider is the way to provide data from xl or multi dimenssional array using @dataprovider in the brackets in @test

public class AssertionInTestNG {
	@Test
	public void test1() {
		Assert.assertTrue(true);
		}
	@Test
	public void test2() {
		Assert.assertTrue(false);
	
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("America", "American");
	}

}
