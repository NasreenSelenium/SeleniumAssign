package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage(ChromeDriver driver) {
		//Assigning local driver to global driver //this is specific to parallael execution
		this.driver = driver;
		
	}
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}

}
