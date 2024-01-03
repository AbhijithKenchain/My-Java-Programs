package tyss.Strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class UniqueOccuranceUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Tester";
		String st=s.toLowerCase();
		
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		
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
			if(m.getValue()==1)
			{
				System.out.println(m.getKey()+" unique character------>    "+m.getValue());
			}
		}
	}

}
