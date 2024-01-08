package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{
	
	
		@BeforeTest
		public void setUp() {
			excelFile = "CreateLead";
		}
	@Test(dataProvider = "getData")
	public void runCreateLead(String cname,String fname,String lname) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.lastName(lname)
		.clickCreateLeadButton()
		.verifyFirstName();
		
		
	}

}
