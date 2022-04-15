package com.JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Object>a=new ArrayList<>();

a.add("Love");
a.add('H');
a.add(123.123);
a.add(123);
a.add("I love You Timsy");

for (int i=0;i<a.size();i++)
{
	System.out.println(i+" "+a.get(i));}
	System.out.println("***********************");
for(Object Var:a)
{
	System.out.println(Var);}
}}
