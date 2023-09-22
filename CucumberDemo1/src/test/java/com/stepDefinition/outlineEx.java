package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class outlineEx {
WebDriver driver=new ChromeDriver();

	

	@Given("user is in loginpage")

	public void user_is_in_loginpage() {

		System.out.println("Step1: User is on login page");

		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

 

	@When("user enters (.*) and  (.*)$")

	public void user_enters_admin_and_admin123(String Username,String Password) {

		System.out.println("Step1: Enters username and password");

		driver.findElement(By.name("username")).sendKeys(Username);

		driver.findElement(By.name("password")).sendKeys(Password);

		

	}

 

	@When("Click the login button")

	public void click_the_login_button() {

		System.out.println("Step3: Clicks on loginbutton");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

 

	@Then("user should land on Homepage")

	public void user_should_land_on_homepage() {

		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

	}

 

	@When("user enters admin1 and  admin1234")

	public void user_enters_admin1_and_admin1234(String Username,String Password) {

		driver.findElement(By.name("username")).sendKeys(Username);

		driver.findElement(By.name("password")).sendKeys(Password);

	}

 
 
	
}
