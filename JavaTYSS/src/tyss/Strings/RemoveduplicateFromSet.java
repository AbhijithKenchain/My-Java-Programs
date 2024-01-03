package tyss.Strings;

import java.util.LinkedHashSet;

public class RemoveduplicateFromSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Tester";
		String st=s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		
		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));
		}
	System.out.println(set);
	
	}
	

}
