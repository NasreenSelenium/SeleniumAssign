package week2.assign1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFaceBookAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

	}

}
