package tyss.practice;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String>ht=new Hashtable<Integer, String>();
		ht.put(1, "hi");
		ht.put(2, "hello");
		ht.put(3, "samarika");
		ht.put(4, "dattebayo");
		ht.put(5, "kaisoku");
		ht.put(11, "zorojuro");
		ht.put(7, "Sanjuro");
		ht.put(8, "TonytonyChopper");
		ht.put(9, "nikaDLuffy");
	//	ht.put(null,null); null not allowed
		//ht.put(null, "kaisokuni");not allowed
		ht.put(10, "oraora");
		for(Entry<Integer, String> hashtable:ht.entrySet())
		{
			System.out.println(hashtable.getKey()+" -------->    "+hashtable.getValue());
		}
for(Integer onlykeys:ht.keySet())
{
	System.out.println(onlykeys);
}
	}

}
