package tyss.practice;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();
		hm.put(1, 2300);
		hm.put(88, 4654);
		hm.put(2, 2);
		hm.put(34, 230);
		hm.put(41, 9300);
		hm.put(52, 6540);
		hm.put(63, 6641);
		hm.put(71, 7987);
		hm.put(98, 45612);
		hm.put(109, 23000);
		

		for (Entry<Integer, Integer> hmp : hm.entrySet()) {
			System.out.println(hmp.getKey() + "------->" + hmp.getValue());
		}
		for (Integer hmo : hm.keySet()) {
			System.out.println(hmo);
		}
	}

}
