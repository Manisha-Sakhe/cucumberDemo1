package com.Reportprop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFileData {
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	File file=new File("C:\\Users\\mrajusakhe\\Desktop\\GitExp\\cucumberDemo1\\CucumberDemo1\\src\\main\\java\\resources\\features\\data1.properties");
	FileInputStream fileInput = null;

	try {
	   	  fileInput = new FileInputStream(file);
     }catch(FileNotFoundException e) {
	    	  e.printStackTrace();
 	  }

	  Properties prop = new Properties();
         try {
	    	  prop.load(fileInput);
	      }catch(IOException e) {
	    	  e.printStackTrace();
	      }

	      

	WebDriver driver = new ChromeDriver();
    driver.get(prop.getProperty("URL"));
    driver.manage().window().maximize();

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
     driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
     driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
     driver.findElement(By.xpath("//button[@type='submit']")).click();
	      

    System.out.println("URL is:"+" "+prop.getProperty("URL"));
    System.out.println("URL is:"+" "+prop.getProperty("username"));
    System.out.println("URL is:"+" "+prop.getProperty("password"));

	  //    driver.close();
 		}
	}

