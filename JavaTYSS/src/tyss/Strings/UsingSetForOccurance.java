package tyss.Strings;

import java.util.LinkedHashSet;

public class UsingSetForOccurance {

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
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<st.length();i++)
			{
				if(ch==st.charAt(i))
				{
					count++;
				}
			}
			if(count>1)//for duplicate occurence
				//if(count>=1)for every occurence
				//if(count==1)for unique occurence
			{
				System.out.println(ch+" repeated------>"+count+" times");
			}
		}
		
	}

}
