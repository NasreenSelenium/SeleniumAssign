package week4.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn active')])[2]")).click();
		//first bus name
		String busname = driver.findElement(By.xpath("//h5[text()='Yolo Bus']")).getText();
		System.out.println("Print the name of the first resulting bus is :"+busname);
		Thread.sleep(1000);
		//click on sleerper
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		Thread.sleep(1000);
		//count of seats
		String countofseats = driver.findElement(By.xpath("//small[text()='32']")).getText();
		System.out.println("Print the first resulting bus seat count :"+countofseats);
		Thread.sleep(1000);
		//click on show seats
		driver.findElement(By.xpath("//button[contains(@class,'btn bus-info-btn')]")).click();
		Thread.sleep(1000);
		//click on seat selected
		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();
		Thread.sleep(1000);
		
		//click on first resulting bus boadring and droping point
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		
		//print seat selected and fare
		String seatselect = driver.findElement(By.xpath("//span[@class='text-primary']")).getText();
		System.out.println("Selected Seat:"+seatselect);
		
		String fare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("Fare:"+fare);
		Thread.sleep(1000);
		System.out.println("Title of page :"+driver.getTitle());
		driver.close();
		
		
		
		

	}

}
