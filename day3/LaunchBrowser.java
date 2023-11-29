package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		try {
		// setup the path and launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//find the element and enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
			Thread.sleep(3000);
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nasreen");
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Banu");
		Thread.sleep(3000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

}
