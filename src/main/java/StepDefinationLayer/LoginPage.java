package StepDefinationLayer;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	@When("enter valid username and password in CRM")
	public void enter_valid_username_and_password_in_crm() {
		driver.findElement(By.name("email")).sendKeys("dnyaneshkadam0702@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Dk@7798913075");
		driver.findElement(By.xpath("//div[text()='Login']")).click();   
	}

	@Then("user is on CRM home page")
	public void user_is_on_crm_home_page() {
		System.out.println(driver.getCurrentUrl());
	    
	}


}
