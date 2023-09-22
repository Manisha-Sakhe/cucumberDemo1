package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Adminhrm {
	 WebDriver driver=new ChromeDriver();
	 
		@Given("user should be on admin page")

		public void user_should_be_on_admin_page() {

		    // Write code here that turns the phrase above into concrete actions

			driver.get("https://opensource-demo.orangehrmlive.com/");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		}

	 

		@Given("click on admin")

		public void click_on_admin() {

		    // Write code here that turns the phrase above into concrete actions

		    

		}

	 

		@Then("validates whether the user is on admin page")

		public void validates_whether_the_user_is_on_admin_page() {

		    // Write code here that turns the phrase above into concrete actions

		}

}
