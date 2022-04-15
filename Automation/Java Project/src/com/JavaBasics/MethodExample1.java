package com.JavaBasics;

public class MethodExample1 {
public void Test1()
{System.out.println("Test1 executed successfully");
	}
public static void main(String[] args)
{
	//To access the user defined methods we have to create an object
	
	MethodExample1 m=new MethodExample1();
	m.Test1();
	m.Test2();
	
} public void Test2()
{
	System.out.println("Test2 executed successfully");}
}
