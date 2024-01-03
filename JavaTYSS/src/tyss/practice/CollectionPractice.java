package tyss.practice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object>al=new ArrayList<Object>();
		al.add(20);
		al.add("hi");
		al.add('A');
		al.add(true);
		al.add(2, 52);
		System.out.println(al);
		al.remove(3);
		
		System.out.println(al);
		
		
ArrayList<Integer>al1=new ArrayList<Integer>();
al1.add(20);
al1.add(32);
al1.add(85);
al1.add(156);
al1.add(2);
al1.add(500);
System.out.println(al1);
for (Integer all:al1)
{
	System.out.println(all);
}
	
	
	
	
	
	
	
	
	
	
	}

}
