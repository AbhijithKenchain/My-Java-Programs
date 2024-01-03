package tyss.Strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateOcuuranceUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Tester";
		String st=s.toLowerCase();
		
		LinkedHashMap<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<st.length();i++)
		{
			if(map.containsKey(st.charAt(i)))
			{
				map.put(st.charAt(i), map.get(st.charAt(i))+1);
			}
			else
			{
				map.put(st.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()>=1)
				System.out.println(m.getKey()+"    "+m.getValue());
			//for removing duplicates
			System.out.print(m.getKey()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
