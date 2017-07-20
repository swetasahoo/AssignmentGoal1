package com.munjing;

public class OddNumberSum {
	private int number;
	
	public int sumOdd(int number)
	{
		int sumOdd=0;
		int remainder;
		
		while(number>0)
		{
			remainder=number%10;
			if(remainder%2!=0)
			{
				sumOdd=sumOdd+remainder;
			}
			number=number/10;
			
		}
		return sumOdd;
	}
}
