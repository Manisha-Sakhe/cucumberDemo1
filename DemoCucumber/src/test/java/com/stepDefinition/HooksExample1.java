package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HooksExample1 {
	WebDriver driver = new ChromeDriver();
	@Before("@T1")

	 

	public void before() {
System.out.println("Before Test");
}
	@Given("Browser opens")
	public void browser_opens() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
	}

	@When("open google page")
	public void open_google_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com");		 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Then("validates the title of the page with expeceted value")
	public void validates_the_title_of_the_page_with_expeceted_value() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");	   
	}
	@After("@T1")
	public void after() {
    System.out.println("After test");
}

}