package com.exception;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = scan.nextInt();
		System.out.println("enter the second number");
		int b = scan.nextInt();
		try
		{
			System.out.println("Answer for a/b is :"+a/b);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("denominator can not be zero....Re enter the value");
			b=scan.nextInt();
			try {
				System.out.println("Answer for a/b is :"+a/b);
			}
			catch(ArithmeticException e2)
			{
				System.out.println("program will terminated");
			}
		}

	}

}
