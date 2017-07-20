package com.testcase;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.munjing.EvenNumberSum;
import com.munjing.InputData;
import com.munjing.SortNumberAscending;

public class SortNumberAscendingTestCase {

	SortNumberAscending sortNumberAscending;
	InputData inputData;
	
	@Before
	public void init() {
		inputData=new  InputData();
		sortNumberAscending=new SortNumberAscending();
	}	
	@Test
	public void sortDigitOfNumber()
	{
		int number=inputData.acceptNumber();
		int result=sortNumberAscending.sortNumber(number);
		assertNotNull(number);
		display("sortDigitOfNumber",result);
	}
	public void display(String message,int number)
	{
		System.out.println(message);
		System.out.println("********************** ");
		System.out.println(number);
		System.out.println("****************************** ");
	}
	
}
