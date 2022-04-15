package com.JavaBasics;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hello",b="Hello";
if(a.equals(b))
{System.out.println("Both the strings are equal");
	}
else{System.out.println("Both the strings are not equal");}
System.out.println("*********************");

String x="Hello";
String y="hello";
if(x.equals(y))
{System.out.println("Both the strings are equal");}
else {System.out.println("Both the strings are not equal");}

System.out.println("####################################");

String p="Hello",q="hello";
if(p.equalsIgnoreCase(q))
{System.out.println("Both the strings are equal");}
else {System.out.println("Both the strings are not equal");}
System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

String i="Hello",j="ello";
if(j.contains(i)) {System.out.println("String existing");}
else {System.out.println("String doesn't exist");}
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

String h = "Pranith";
int String_Length= h.length();
System.out.println("String length is:"+String_Length);
System.out.println("1111111111111111111111111111111111");

String w="Chello";
String v="Khello";
if(w.length()==v.length())
{System.out.println("The length of the strings are equal");}

else {System.out.println("The length of the strings are not same");}
	}

}
