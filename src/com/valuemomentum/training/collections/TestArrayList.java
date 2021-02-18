package com.valuemomentum.training.collections;
import java.util.*;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al=new ArrayList<String>();//creating arraylist
		al.add("Jim");//add is algo
		al.add("Michael");
		al.add("James");
		al.add("Andy");
		
		//traversing elements using Iterator
		Iterator itr=al.iterator();//itr is obj of iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
