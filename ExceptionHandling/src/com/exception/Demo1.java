package com.exception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("canot divide by zero");
		}
		

	}

}
