package practice;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedhashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(null);
		lhs.add(null);
		lhs.add("mahesh");
		lhs.add(null);
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add(null);
		ts.add("mahesh");
		System.out.println(ts);
		

	}

}
