package com.JavaBasics;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Object a[][]=new Object[3][3];
a[0][0]="Hello";
a[0][1]=2;
a[0][2]=1.22;
a[1][0]=23;	
a[1][1]='M';*/
//a[1][2]="Hi";   
  
Object a[]=new Object[3];
a[0]=1.234;
a[1]="Hello";
a[2]='m';
for(int i=0;i<a.length;i++)
//for(int i=0;i<3;i++)
{
System.out.println(a[i]);	
}
	}

}
