package com.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest {
		
	WebDriver driver= null;
	 
	
	@Given("^Open Firefox Browser and Navigate to Orange HRM Application$")
	public void Open_Firefox_Browser_and_Navigate_to_Orange_HRM_Application()
		{
		    System.setProperty("webdriver.IEDriver.driver","./DriverFiles/IEDriverServer.exe");
	   driver= new InternetExplorerDriver();
	   String url="https://opensource-demo.orangehrmlive.com/";
		    driver.get(url);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		}

	@When("^User Enters Valid Username, password and Click On Signin button$")
	public void User_Enters_Valid_Username_password_and_Click_On_Signin_button()
		{
		   
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
			
			
		}

	@Then("^User Should Be Able to Successfully LogIn to Orange HRM Application and Close$")
	public void User_Should_Be_Able_to_Successfully_LogIn_to_Orange_HRM_Application_and_Close() throws IOException 
		{
		  try 
		   {
			   String Exptxt="Welcome Admin";
			   System.out.println("The Expected Text is: "+Exptxt);
			   String Actxt= driver.findElement(By.id("Welcome")).getText();
			   System.out.println("The Actual Text is: "+Actxt);
			   
			   
			   if(Actxt.contains(Exptxt))
			   {
				   
				   System.out.println("Log In is successful: PASS");
			   }
		   } 
			   
		   
		   catch(Exception e)
		   {
			   String SpanMessage= driver.findElement(By.id("spanMessage")).getText();
			   
			  if(SpanMessage.contains("Invalid credentials"))
			  {
				  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileUtils.copyFile(screenshot,  new File("./Screenshot/imp.png"));
				  
				  System.out.println("LogIn Failed");
			  }
		   }
		
			
		driver.quit();	
			
			
		}


	}



