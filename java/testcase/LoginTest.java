
package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		excelFile = "Login";
	}
@Test
	public void runCreateLead() {
	System.out.println("Login testcase");
	LoginPage lp = new LoginPage(driver);
	lp.enterUserName()
	.enterPassword()
	.clickLogin();
	
		
	}

}
