package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	
	public ViewLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}
			public ViewLeadPage verifyFirstName() {
			
		        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		        System.out.println(text);
		        //Verification
		        if(text.contains(text)) {
		            System.out.println("Lead is created");
		        }
		        else {
		            System.out.println("Lead is not created");
		        }
		        return this;
		    }

		
	}


