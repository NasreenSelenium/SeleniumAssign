package week4.marathon1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select Chennai
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("nav-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		Thread.sleep(1000);
		
		//selections in Dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='city']"));
		Select drop = new Select(dropdown);
		drop.selectByVisibleText("Chennai");
		Thread.sleep(1000);
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='genre']"));
		Select drop2 = new Select(dropdown2);
		drop2.selectByVisibleText("ANIMATION");
		Thread.sleep(1000);
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='lang']"));
		Select drop3 = new Select(dropdown3);
		drop3.selectByVisibleText("ENGLISH");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		//SELECT MOVIE and display movie name
		String moviename = driver.findElement(By.xpath("//div[text()='Paw Patrol']")).getText();
		System.out.println("Movie name:" + moviename);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).click();
		
		//proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		Select cinema = new Select(driver.findElement(By.xpath("//select[@name='cinemaName']")));
		cinema.selectByVisibleText("PVR Ampa Chennai");
		
		Select time = new Select(driver.findElement(By.xpath("(//select[contains(@class,'input-text form-control')])[2]")));
		time.selectByVisibleText("09:00 AM - 12:00 PM");
		
		
		Select fb = new Select(driver.findElement(By.xpath("(//select[contains(@class,'input-text form-control')])[3]")));
		fb.selectByVisibleText("Yes");
		
		//select the date
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'22')]")).click();
		
		driver.findElement(By.xpath("//label[text()='No. of Seats']/following::input")).sendKeys("Nasreen");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9003134000");
		driver.findElement(By.xpath("(//input[contains(@class,'input-text form-control')])[3]")).sendKeys("4");
		driver.findElement(By.xpath("//label[text()='Name']/following::input")).sendKeys("sheik.banu24@gmail.com");
		driver.findElement(By.xpath("//label[text()='F&B Requirements']/following::input")).sendKeys("nothing");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-primary')])[2]")).click();
		//Handle Alert
		
		//driver.findElement(By.xpath("(//div[@class='ui text-center'])[4]"));
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		//close the popup
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		//verify the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		//driver.close();
		

	}

}
