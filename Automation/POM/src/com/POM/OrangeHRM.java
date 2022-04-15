package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM 
{
	//Object repository class-Identiification of an Element then performed operation.
	
		@FindBy(name="txtUsername")
		WebElement Username;
		@FindBy(name="txtPassword")
		WebElement Password;
		@FindBy(name="Submit")
		WebElement LogIn;
		
		public void logIn(String txtUsername,String txtPassword )
		{
			Username.clear();
			Username.sendKeys(txtUsername);
			Password.clear();
			Password.sendKeys(txtPassword);
			
			LogIn.click();
		}
		
		@FindBy(xpath="//*[@id='social-icons']/a[1]")
		WebElement LinkedIn;
		public void LinkedIn()
		{
			LinkedIn.click();  //Operation
		}
		
		@FindBy(xpath="//*[@id='social-icons']/a[2]")
		WebElement Facebook;
		public void Facebook()
		{
			Facebook.click();
		}
		
		@FindBy(xpath="//*[@id='social-icons']/a[3]")
		WebElement Twitter;
		public void Twitter()
		{
			Twitter.click();
		}
		
		@FindBy(xpath = "//*[@id='social-icons']/a[4]")
		WebElement Youtube;
		public void Youtube()
		{
			Youtube.click();
		}
		
		
}
