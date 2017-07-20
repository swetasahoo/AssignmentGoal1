package com.testcase;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.munjing.InputData;
import com.munjing.SplitDigit;

public class SplitDigtTestCase {

	InputData inputData;
	SplitDigit splitDigit;
	
	@Before
	public void init() {
		inputData=new  InputData();
		splitDigit=new SplitDigit();
	}
	
	@Test
	public void splitDigitOfNumber()
	{
		int number=inputData.acceptNumber();
		int []result=splitDigit.splitNumber(number);
		assertNotNull(number);
		
		display("splitDigitOfNumber", result);

	}
	public void display(String message,int number[])
	{
		System.out.println(message);
		System.out.println("********************** ");
		for(int i=0;i<number.length;i++)
		{
		System.out.print(number[i]+"   ");
		}
		System.out.println("\n");
		System.out.println("****************************** ");
	}
}
