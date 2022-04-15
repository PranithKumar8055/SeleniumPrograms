package com.ValidationofTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BingTitleValidation {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\PranithKumar\\Desktop\\Automation\\Java Project\\Driver Files\\geckodriver.exe");
FirefoxDriver FD= new FirefoxDriver();
FD.get("https://www.bing.com");
FD.manage().window().maximize();
String Title =FD.getTitle();

System.out.println("The actual title of Bing home page is "+Title);

String Expected_Title= "Bing";
System.out.println("The expected title of bing home page is "+Expected_Title);

if(Title.equalsIgnoreCase(Expected_Title))
{
System.out.println("The bing home page title is same as expected");	
}
else {
	System.out.println("The actual title is not same as expected one");
}
Thread.sleep(5000);
FD.close();
	}

}
