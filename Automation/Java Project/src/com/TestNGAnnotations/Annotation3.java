package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 {
@BeforeMethod
public void gmailLaunchAndLogIn()
{
System.out.println("Application Launch And LogIn");	
}
@Test(priority=0)
public void composeMail()
{System.out.println("Compose Mail Functionality Testing");}
@AfterMethod
public void logOut()
{System.out.println("Gmail Application Close");}
}
