package com.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.munjing.InputData;


public class InputDataTestCase {
	InputData inputData;

	@Before
	public void init() {
		inputData=new  InputData();
	}
	
	@Test
	public void inputNumber()  {
		int number=inputData.acceptNumber();	
		assertNotNull(number);
		display("inputNumber", number);


	}
	
	public void display(String message,int number)
	{
		System.out.println(message);
		System.out.println("********************** ");
		System.out.println(number);
		System.out.println("****************************** ");
	}

}
