package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class demoBlaze {
	WebDriver driver=new ChromeDriver();
	String price="$790";
	String s;

	
	@Given("check the price of iphone")
	public void check_the_price_of_iphone() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The price of the iphone is $790");
		}

	@Then("click on iphone")
	public void click_on_iphone() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[contains(text(), 'Iphone 6 32gb')]")).click();
	    WebElement element1 =driver.findElement(By.xpath("//*[@class='price-container']"));
	    s= element1.getText();
	    	}

	@Then("validate price of iphone")
	public void validate_price_of_iphone() {
	    // Write code here that turns the phrase above into concrete actions
			Assert.assertEquals(s.subSequence(0, 4), price);
		}

} 
