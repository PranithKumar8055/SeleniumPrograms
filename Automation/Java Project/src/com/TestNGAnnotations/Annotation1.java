package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotation1 {

	@Test(priority=1)
	public void applicationLaunch()
	{
		System.out.println("Gmail Application Launch");
	}
@Test(priority=2)
public void LogIn()
{
	System.out.println("Gmail logIn functionality testing");
}
@Test(priority=3)
public void composeMail()
{
System.out.println("Compose mail functionality testing");	
}
@Test(priority=0)
public void draft()
{
System.out.println("Draft functionality testing");	
}
	}


