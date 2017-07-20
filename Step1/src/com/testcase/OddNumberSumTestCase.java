package com.testcase;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


import com.munjing.InputData;
import com.munjing.OddNumberSum;

public class OddNumberSumTestCase {

	InputData inputData;
	OddNumberSum oddNumberSum;
	@Before
	public void init() {
		inputData=new  InputData();
		oddNumberSum=new OddNumberSum();
	}
	
	@Test
	public void sumOfOddNumber()
	{
		int number=inputData.acceptNumber();
		
		int result=oddNumberSum.sumOdd(number);
		
		assertNotNull(number);
		display("sumOfOddNumber", result);

	}
	public void display(String message,int number)
	{
		System.out.println(message);
		System.out.println("********************** ");
		System.out.println(number);
		System.out.println("****************************** ");
	}
}
