package com.pack1;

public class Test02 
{
	void meth1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
	   new Test02().meth1();	
	}

}
