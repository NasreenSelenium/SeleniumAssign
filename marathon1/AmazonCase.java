package week4.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonCase {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search Bags for b
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		driver.findElement(By.xpath("(//span[text()='oys'])[1]")).click();
		//Print the total
		String total = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();
		System.out.println("results for bags for boys " + total);
		//Selecting Brands
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		//sorting on new arrivals
				/*
		 * WebElement drop = driver.findElement(By.xpath("//span[text()='Sort by:']"));
		 * Select drop1 = new Select(drop);
		 * drop1.selectByVisibleText("Newest Arrivals");
		 */
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.id("s-result-sort-select_4")).click();
		//select First displayed bag details
		String Brnd = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
		System.out.println("Brand Name:"+Brnd);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of selected Brand:"+price);
		//Title of Page
		System.out.println("Title of Page :"+driver.getTitle());
		//Close Browser
		driver.close();
		System.out.println("Browser closed");
		
		
		
		

	}

}
