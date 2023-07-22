package com.pack1;

public class Test 
{
	void display(int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Test obj=new Test();
		obj.display(5);
	}
}
