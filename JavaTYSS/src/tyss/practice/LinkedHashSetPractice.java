
package tyss.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet<Object>lhs=new LinkedHashSet<Object>();
		lhs.add(56);
		lhs.add(null);
		lhs.add(null);
		lhs.add('&');
		lhs.add("hi");
		lhs.add(10.50);
		
		System.out.println(lhs);
		
	Iterator<Object>it=lhs.iterator();
	while(it.hasNext())
	{
		

		System.out.println(it.next());
	}
	}

}
