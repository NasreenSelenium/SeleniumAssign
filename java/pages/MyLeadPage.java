package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod{
		public MyLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}
	public CreateLeadPage clickCreateLead () {
	driver.findElement(By.linkText(prop1.getProperty("linkcreatelead"))).click();
	return new CreateLeadPage(driver);
		
	}

}
