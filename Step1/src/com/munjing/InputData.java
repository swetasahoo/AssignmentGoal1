package com.munjing;

import java.util.Scanner;

public class InputData {
	private int number;
	public int acceptNumber()
	{
		System.out.println("Enter a Number");
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		return number;
		
	}

}
