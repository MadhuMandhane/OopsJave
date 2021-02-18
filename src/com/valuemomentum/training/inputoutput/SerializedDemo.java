package com.valuemomentum.training.inputoutput;
import java.io.*;
public class SerializedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee();
e.name = "Micheal khan";
e.address =" Castel Street, Banglore";
e.SSN = 11122333;
e.number = 102;
try
{
	FileOutputStream fileOut = new FileOutputStream("c:/demo/employee.ser");//write to file
	ObjectOutputStream out = new ObjectOutputStream(fileOut);//reads object
	out.writeObject(e);
	out.close();
	fileOut.close();
	System.out.printf("Seialized data is saved in c:/demo/employee.ser");
	
	
}
catch(IOException i)
{
	
}
	}

}
