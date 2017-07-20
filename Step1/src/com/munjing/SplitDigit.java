package com.munjing;

public class SplitDigit {

	int number;
	public int[] splitNumber(int number)
	{
	
		int remainder;
		int counter=0;
		int reverse=0;
		int []splitDigitArray;
		
		//reverse the number
		while(number>0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;	
			counter++;
		}
		
		splitDigitArray=new int[counter];
		counter=0;
		//reverse again and store in int array
		while(reverse>0)
		{
			remainder=reverse%10;
			splitDigitArray[counter]=remainder;
			reverse=reverse/10;
			counter++;
		}
		
		return splitDigitArray;
		
	}
}
