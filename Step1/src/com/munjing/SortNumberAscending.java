package com.munjing;

public class SortNumberAscending {

	private int number;
	
	public int sortNumber(int number)
	{
		int sortedNumber = 0;
		for (int i = 9; i >= 0; i--)
		{

		    int tmpNumber = number;
		    while (tmpNumber > 0)
		    {
		        int digit = tmpNumber % 10;             
		        if (digit == i)
		        {
		            sortedNumber *= 10;
		            sortedNumber += digit;
		        }
		        tmpNumber /= 10;                
		    }               
		}
		
		return sortedNumber;
	}
}
