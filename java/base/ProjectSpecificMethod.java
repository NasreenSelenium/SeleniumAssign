package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadExcel;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String excelFile;
	public static Properties prop;
	public static Properties prop1;
	
	
	@BeforeMethod
	public void preCondition() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		prop = new Properties();
		//setup file path
		FileInputStream fis = new FileInputStream(new File ("./src/main/resources/config.properties"));
		//Load the file to properties
		prop.load(fis);
		//get values from propertyfile
		driver.get(prop.getProperty("url"));
		//instead of below url using above property file
		//driver.get("http://leaftaps.com/opentaps/control/login");
		String lang = prop.getProperty("language");
		System.out.println("lang"+ lang);
		prop1 = new Properties();
		FileInputStream fis1 = new FileInputStream(new File ("./src/main/resources/"+lang+".properties"));
		
		prop1.load(fis1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@DataProvider(name  = "getData")
	public String[][] fetchData() throws IOException
	{
		String[][] readData = ReadExcel.readData(excelFile);
		return readData;
	}

}
