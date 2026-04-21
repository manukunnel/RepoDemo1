package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<>();
		student.add("Manu");
		student.add("anu");
		student.add("Appu");
		System.out.println(student);
		System.out.println(student.get(0));
		System.out.println(student.set(1,"chippy"));
		System.out.println(student);
		
		for(String stu : student)
		{
			System.out.println(stu);
		}
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("banana");
		
		Iterator<String> it = fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	

}
