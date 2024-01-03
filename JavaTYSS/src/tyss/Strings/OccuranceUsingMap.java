package tyss.Strings;

import java.util.HashMap;

public class OccuranceUsingMap {

	public static void main(String[] args) {

		String s = "Tester";
		String st = s.toLowerCase();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < st.length(); i++) {
			if (map.containsKey(st.charAt(i))) {
				map.put(st.charAt(i), map.get(st.charAt(i)) + 1);
			} else {
				map.put(st.charAt(i), 1);

			}
		}
		System.out.println(map);

	}

}
