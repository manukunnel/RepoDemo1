package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoTwoSet {

	public static void main(String[] args) {
		Set<String> st = new HashSet<>();
		st.add("Apple");
		st.add("banana");
		st.add("apple");
		st.add("kiwi");
		System.out.println(st);
		System.out.println(st.contains("aPple"));
		System.out.println(st.remove("kiwi"));
		System.out.println(st);
		System.out.println(st.size());
		
		System.out.println("**********for Each Loop**********");
		for(String fruit : st)
		{
			System.out.println(fruit);
		}
		
		System.out.println("**********Using Iterator**********");
		
		Iterator<String> it = st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
