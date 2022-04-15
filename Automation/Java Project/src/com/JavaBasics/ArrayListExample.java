package com.JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
List<Object> a=new ArrayList<>();
	a.add("Hello");
	a.add(12);
	a.add(123.123);
	a.add('a');
	//for(int i=0;i<a.length;i++)
	for(int i=0;i<a.size();i++)
	{
		System.out.println(i+" "+a.get(i));
	}
	System.out.println("*******************************");
	for(Object Var:a)
	{
		System.out.println(Var);
	}
		
		
	}

}
