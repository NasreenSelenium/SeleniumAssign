package week2.assign1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester.");
		
		//dropdown
		WebElement dropdwn1 = driver.findElement(By.name("industryEnumId"));
		Select drop1 = new Select(dropdwn1);
		drop1.selectByIndex(3);
		
		WebElement dropdwn2 = driver.findElement(By.xpath("//select[@name = 'ownershipEnumId']"));
		Select drop2 = new Select(dropdwn2);
		drop2.selectByVisibleText("S-Corporation");
		

		WebElement dropdwn3 = driver.findElement(By.xpath("//select[@id = 'dataSourceId']"));
		Select drop3 = new Select(dropdwn3);
		drop3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dropdwn4 = driver.findElement(By.xpath("//select[@id = 'marketingCampaignId']"));
		Select drop4 = new Select(dropdwn4);
		drop4.selectByIndex(6);
		
		WebElement dropdown5 = driver.findElement(By.xpath("//select[@id = 'generalStateProvinceGeoId']"));
		Select drop5 = new Select(dropdown5);
		drop5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class = 'smallSubmit']"));
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
