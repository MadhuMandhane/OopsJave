package com.valuemomentum.training.inputoutput;
import java.io.*;

public class DataStreamDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
DataInputStream d=new DataInputStream(new FileInputStream("test.txt"));
DataOutputStream out=new DataOutputStream(new FileInputStream("test1.txt"));

String count;
while((count = d.readLine())!=null) {
	String u = count.toUpperCase();
	System.out.println(u);out.writeBytes(u+",");
}
d.close();
out.close();
	}

}
