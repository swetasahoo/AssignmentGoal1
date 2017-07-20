package com.testcase;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.munjing.EvenNumberSum;
import com.munjing.InputData;

public class EvenNumberSumTestCase {

	InputData inputData;
	EvenNumberSum evenNumberSum;
	@Before
	public void init() {
		inputData=new  InputData();
		evenNumberSum=new EvenNumberSum();
	}
	
	@Test
	public void sumOfEvenNumber()
	{
		int number=inputData.acceptNumber();
		
		int result=evenNumberSum.sumEven(number);
		
		assertNotNull(number);
		display("sumOfEvenNumber", result);

	}
	public void display(String message,int number)
	{
		System.out.println(message);
		System.out.println("********************** ");
		System.out.println(number);
		System.out.println("****************************** ");
	}
}
