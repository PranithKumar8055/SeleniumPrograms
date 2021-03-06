package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@BeforeTest
	public void applicationLaunch()
	{
		System.out.println("Application Launch Testing");
	}
    @Test(priority=0)
    public void logIn()
    {
    	System.out.println("Login Functionality Testing");
    }
    @Test(enabled=false)  // To skip this test (enabled=false)similarly to run (enabled=true)
    public void composeMail()
    {System.out.println("Compose Mail Functionality Testing");}
    
    @AfterTest
    public void logOut()
    {
    	System.out.println("Logout Functionality Testing");
    }
    
    
}
