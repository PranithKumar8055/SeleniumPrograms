package com.JavaBasics;

public class MethodExample2 {
	int a=10,b=20;
	int c;
	public static void main (String[] args) {
		//int c;
		MethodExample2 L= new MethodExample2();
		L.love();
		L.Life();
	}
	public void love()
	{
		System.out.println("a+b= " +(a+b));
	}
public void Life()
{
c=a+b;
System.out.println("a+b= "+c);
}
}
