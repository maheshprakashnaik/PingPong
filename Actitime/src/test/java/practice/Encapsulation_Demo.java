package practice;

import java.util.HashSet;
import java.util.Iterator;

public class Encapsulation_Demo {

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("mango");
		hs.add("apple");
		hs.add("pineapple");
		hs.add("mango");
		
		HashSet<String> hs2 = new HashSet<String>();
		hs.add("pen");
		
		hs.addAll(hs2);
		
		Iterator<String> its =hs.iterator();
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		

	}

}
