package tyss.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object>hs=new HashSet<Object>();
		hs.add(56);
		hs.add(null);
		hs.add(null);
		hs.add('&');
		hs.add("hi");
		hs.add(10.50);
		
		System.out.println(hs);
		
	Iterator<Object>it=hs.iterator();
	while(it.hasNext())
	{
		
		

		System.out.println(it.next());
	}
		
		
		
		
		
		
	}

}
