package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Loginfeatures {
	WebDriver driver=new ChromeDriver();

//	@Given("user should be on login page")
 //	public void user_should_be_on_login_page() {
 //	    // Write code here that turns the phrase above into concrete actions
 //		driver.get("https://opensource-demo.orangehrmlive.com/");
 //		driver.manage().window().maximize();
 //		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 //	}

	@Given("user should open {string}")
	public void user_should_be_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(string);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

//	@When("user enters username and password")
//
//	public void user_enters_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//	}

//	@When("user enters {string} and {string}")
//
//	public void user_enters_and(String string, String string2) {
     // Write code here that turns the phrase above into concrete actions
 //		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
 //		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
 //	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_admin_and_admin123(String str,String str2) {
 	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(str);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(str2);
	}

 

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

 

	@Then("validates whether the user successfully logged in")
	public void validates_whether_the_user_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	}

 

