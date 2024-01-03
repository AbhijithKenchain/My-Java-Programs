package tyss.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(22);
		ts.add(89);
		ts.add(61);
		ts.add(69);
		
		ts.add(961);
		ts.add(661);
		ts.add(619);
		
		ts.add(123);
		ts.add(6155);
		System.out.println(ts);
		Iterator<Integer>i=ts.iterator();
		while(i.hasNext())
		{
			Integer iy=i.next();
			if(iy<70)
			{
				i.remove();
			}
		
		}
		for(Integer tv:ts)
		{
			System.out.println(tv);
		}
		System.out.println(ts.descendingSet());
	}

}
