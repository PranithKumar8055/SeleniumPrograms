package com.ApplicationNavigation;

import org.openqa.selenium.edge.EdgeDriver;

public class ApplicationNavigation {

	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\PranithKumar\\Desktop\\Automation\\Java Project\\Driver Files\\msedgedriver.exe");
	EdgeDriver MSE = new EdgeDriver();
	MSE.get("https://www.bing.com");
MSE.findElementById("sb_form_q").sendKeys("facebook");
MSE.findElementById("search_icon").click();
Thread.sleep(2000);
MSE.navigate().to("https://www.facebook.com");
MSE.close();
	}
}
