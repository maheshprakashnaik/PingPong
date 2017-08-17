package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap htr = new HashMap();
		htr.put(100, "sgdfsgr");
		htr.put(454, "jhgseuf");
		System.out.println(htr.get(100));
		System.out.println(htr.containsKey(100));
		System.out.println(htr.values());
		htr.put(1234, 124);
		
		Set grt = htr.entrySet();
		
		Iterator df = grt.iterator();
		
		while(df.hasNext())
		{
			 Map.Entry ffa = (Map.Entry)df.next();
			 System.out.println(ffa.getKey()+"   "+ffa.getValue());
			 
			 
		}
		
		
		

	}

}
