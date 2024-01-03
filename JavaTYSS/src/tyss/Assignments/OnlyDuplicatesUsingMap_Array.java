package tyss.Assignments;

import java.util.HashMap;
import java.util.Map.Entry;

public class OnlyDuplicatesUsingMap_Array {
	public static void main(String[] args) {
		
		
		int[]a= {5,4,4,2,5,4,2,1};
		
		 HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
		 
		 for(int i=0;i<a.length;i++)
			{
				if(map.containsKey(a[i]))
				{
					map.put(a[i], map.get(a[i])+1);
				}
				else
				{
					map.put(a[i], 1);
				}
			}
	    System.out.println(map);
	    
	    for(Entry<Integer, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
				System.out.println(m.getKey()+" repeating   "+m.getValue()+" times");
		}
	}

	}

