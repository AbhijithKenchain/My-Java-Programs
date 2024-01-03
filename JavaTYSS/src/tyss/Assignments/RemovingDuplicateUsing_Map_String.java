package tyss.Assignments;

import java.util.Map.Entry;
import java.util.TreeMap;

public class RemovingDuplicateUsing_Map_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hi hello hi hello welcome";

String[]st=s.split(" ");


TreeMap<String, Integer>map=new TreeMap<String, Integer>();
for(int i=0;i<st.length;i++)
{
	if(map.containsKey(st[i]))
	{
		map.put(st[i], map.get(st[i])+1);
	}
	else
	{
		map.put(st[i], 1);
	}
	
}
System.out.println(map);
	
	for(Entry<String, Integer> m:map.entrySet())
	{
		if(m.getValue()>1)
		{
			System.out.println(m.getKey());
		}
	}
	
	}

	
}
