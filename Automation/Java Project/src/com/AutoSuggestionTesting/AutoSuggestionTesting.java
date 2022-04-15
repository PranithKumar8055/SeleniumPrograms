package com.AutoSuggestionTesting;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver Files/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//When The element is overlaid we can use JavaScript Executer as written but it wont dismiss
		//the overlaid.
		//WebElement From=driver.findElement(By.xpath("//span[text()='From']"));
		//JavascriptExecutor Executer = (JavascriptExecutor)driver;
		//Executer.executeScript("arguments[0].click();",From);
		
	//Thread.sleep(2000);	
	//To solve this overlaid issue we can use this
	driver.switchTo().activeElement(). click();
	//after dismissing the overlaid we can perform the code (driver will be able to find the elements) as usual
	
	driver.findElement(By.xpath("//span[text()='From']")).click();

	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bhuban");

	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bengalu");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label='Thu Mar 31 2022']")).sendKeys(Keys.ENTER);
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	//Thread.sleep(5000);
	
	WebElement popup=driver.switchTo().activeElement();
	popup.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
	
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='customArrow arrowDown']")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Book Now']")).click();
	System.out.println("Till now ok");
	//Thread.sleep(2000);

	//WebElement qlk=driver.findElement(By.xpath("//span[text()='I do not wish to secure my trip']"));
	//Executer.executeScript("arguments[0].click();", qlk);
	//driver.switchTo().frame(driver.findElement(By.id("INSURANCE")));
	//driver.findElement(By.xpath("//span[text()='Travel Insurance']")).click();
	Set<String> windowHandles =driver.getWindowHandles();
	System.out.println(windowHandles);
	Iterator<String> Itrator =windowHandles.iterator();
	String ParentWindow=Itrator.next();
System.out.println(ParentWindow);
	String ChildWindow=Itrator.next();
	driver.switchTo().window(ChildWindow);
	
	System.out.println("Till now ok2");
	driver.findElement(By.xpath("//span[text()='I do not wish to secure my trip']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("Pranith Kumar");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Behera");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@tabindex='0']")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("9030163415");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("p.contentmgm@gmail.com");
driver.findElementByXPath("//p[@class='transparentOverlay']").click();
WebElement continu = driver.findElement(By.xpath("//button[text()='Continue']"));
continu.click();
WebElement popup2=driver.switchTo().activeElement();
popup2.findElement(By.xpath("//button[text()='CONFIRM']")).click();
Thread.sleep(2000);
driver.switchTo().activeElement().click();

//Popup3.findElement(By.xpath("//button[text='Yes, Please']")).click();
//driver.findElementByXPath("//p[@class='ancillaryCheckmark']").click();
Thread.sleep(2000);
//driver.findElement(By.id("BBI$BLR$2022-03-31 07:55$6E-393_31E")).click();
driver.findElementByXPath("//button[text()='Continue']").click();
Thread.sleep(2000);
driver.findElementByXPath("//button[text()='Continue']").click();
driver.switchTo().activeElement().findElement(By.xpath("//button[text()='CONTINUE ANYWAY']")).click();
Thread.sleep(5000);
driver.findElementByXPath("//button[text()='Proceed to pay']").click();
System.out.println("Successfully Tested Flight Booking module: PASS");
Thread.sleep(2000);
driver.quit();
	}

}
