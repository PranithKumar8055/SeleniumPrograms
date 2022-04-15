package com.URLValidation;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookURLValidation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver Files/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
String url="https://www.facebook.com";
	Driver.get(url);
	String ActualTitle=Driver.getTitle();
	System.out.println("The actual title is "+ActualTitle);
	String ExpectedTitle= "Facebook Log in or sign up";
	System.out.println("The expected title is "+ExpectedTitle);
	
	String Expected_URL="facebook.com";
	System.out.println("The expected URL is "+Expected_URL);
	String Current_URL=Driver.getCurrentUrl();
	System.out.println("The current URL is "+Current_URL);
	
if(Current_URL.contains(Expected_URL))
{
System.out.println("The current url is same as expected url:  PASS");	
}
else
{
System.out.println("The current url is not same as expected url: FAIL");	
}
Driver.close();
}

	}


