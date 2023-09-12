package com.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks1 {
	@Before
    public void before(){
  	  System.out.println("Before, Inside the same package");
    }

    @After
    public void after(){
  	  System.out.println("After, Inside the same package");
    }
	
}
