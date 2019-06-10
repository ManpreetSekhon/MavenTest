package practicemaven.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
// READ MAVEN LIFECYCLE
// before/after methods gets executed after every test everytime
// before/after class gets executed ones
// the testing framework which lets us test automate test cases using some standard annotations is called TestNG
// before/after suite:- collection of test cases is called suite


import org.testng.annotations.Test;

public class PractiseTestNG {
	
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("you are in before test");
	}
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void TestBeforeClass() {
		System.out.println("Before Class");
	}

	@Test(priority=0)
		public void testMethod1() {
		System.out.println("this is my first testng  method");
	}
	@Test
	public void testMethod2() {
		System.out.println("this is my second testng method");
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("you are in after test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("After Class");
	}
	
	// in testNG we can grroup the test cases -- smoke,regretion testing.
	// disable some test cases.
	// testNG.xml file is importnt if we have to disable lets say 10 methods out of 50
	// listners in testNG -- interface from the testNG library which lets 
	// us modify the behaviour of testng
	
}
