package com.Inheritance;

public class SubChildClass extends ChildClass {
	public void Test4()
	{
		System.out.println("Test4 executed successfully");
	}
	public static void main(String[] args)
	{
		SubChildClass scc= new SubChildClass();
		scc.Test1();
		scc.Test2();
		scc.Test3();
		scc.Test4();
	}

}
