package com.Frame_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Operation {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","./Driver Files/geckodriver.exe");
FirefoxDriver driver= new FirefoxDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();

driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
 WebElement Draggable =driver.findElement(By.id("draggable"));
 WebElement Droppable = driver.findElement(By.id("droppable"));
 Actions act = new Actions(driver);
 act.dragAndDrop(Draggable, Droppable); act.perform();

 driver.switchTo().defaultContent();//To go back to main frame
 driver.findElement(By.linkText("About")).click();	
  driver.close();}

}
