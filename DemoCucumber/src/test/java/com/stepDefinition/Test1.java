package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Test1 {
	WebDriver driver = new ChromeDriver();
//	@Given("user should be on login page")
//	public void user_should_be_on_login_page() {
//	     driver.get("https://opensource-demo.orangehrmlive.com/");
//	     driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	}
	
	@Given("user should be on  {string}")
	public void user_should_be_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 	}


//	@When("user enters  user name and password")
//	public void user_enters_user_name_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
// 	}
//	@When("user enters  {string} and {string}")
//	public void user_enters_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);

//	}
	@When("user enters  (.*) and (.*)$")
	public void user_enters_admin_and_admin123(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);


	}



	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Then("validate whether user successfully logged  in")
	public void validate_whether_user_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}



}
