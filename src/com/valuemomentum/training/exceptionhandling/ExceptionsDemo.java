package com.valuemomentum.training.exceptionhandling;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String languages[] = {"C", "C++", "JAVA", "PERL","PYTHON"};	
	try
	{
		for(int c=1; c<=5; c++)
			System.out.println(languages[c]);
	}

	catch(Exception e)
	{
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

}
}
