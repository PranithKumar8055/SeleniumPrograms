package com.Inheritance;

public class ChildClass extends ParentClass {
	public void Test3()
	{
		System.out.println("Test3 executed successfully");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello Timsy");
		ChildClass cc= new ChildClass();
		cc.Test1();
		cc.Test2();
		cc.Test3();
	}

}
