package com.tnsif.core;

public class FirstProblem 
{
	public static void main(string[] args) {
		int x=0;
		do
		{
			System.out.println(x);
			if(++x<5)
				continue;
			x++;
			System.out.println(x);
		} while(++x<10);
	}

}
