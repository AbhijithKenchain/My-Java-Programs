package tyss.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
hm.put(1,2300);
hm.put(8,4654);
hm.put(2,2);
hm.put(3,230);
hm.put(4,9300);
hm.put(5,6540);
hm.put(6,6641);
hm.put(7,7987);
hm.put(9,45612);
hm.put(10,23000);
//hm.putIfAbsent(30, 7777);

for(Entry<Integer, Integer> hmp:hm.entrySet())
{
	System.out.println(hmp.getKey()+"------->"+hmp.getValue());
}
for(Integer hmo:hm.keySet())
{
	System.out.println(hmo);
}
	}

}
