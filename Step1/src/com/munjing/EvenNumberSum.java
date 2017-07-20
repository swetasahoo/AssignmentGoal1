package com.munjing;

public class EvenNumberSum {

	private int number;
	
	public int sumEven(int number)
	{
		int sumEven=0;
		int remainder;	
		while(number>0)
		{
			remainder=number%10;
			if(remainder%2==0)
			{
				sumEven=sumEven+remainder;
			}
			number=number/10;
			
		}
		return sumEven;
	}
}
