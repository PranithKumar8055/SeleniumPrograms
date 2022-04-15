package com.JavaBasics;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[][]=new String[2][2];
a[0][0]= "Love";
a[0][1]="You";
a[1][0]="Like";
a[1][1]="Mad";

for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{System.out.print(a[i][j]+" ");}
System.out.println();
}
System.out.println("****************************");
	String L[][]=new String[3][3]; 
	L[0][0]="Timsy";
	L[0][1]="I Love You";
	L[1][0]="Be My";
	L[1][1]="Queen";
	for(int l=0;l<2;l++)
	{
		for(int k=0;k<2;k++)
		{System.out.print(L[l][k]+" ");
		}System.out.println();
		
	}
	}

}
