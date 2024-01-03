package tyss.practice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> li = new LinkedList<Object>();
		li.add(6);
		li.add("Li");
		li.add('p');
		li.add(null);
		li.add(false);
		li.add("bye");
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
for(Object list:li)
{
	System.out.println(list);
}
	}

}
