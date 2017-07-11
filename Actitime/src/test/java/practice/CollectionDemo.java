package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mahesh");
		list.add("mahi");
		list.add("mahya");
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.clear();
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}

	}

}
