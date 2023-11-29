package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		

	}

}
