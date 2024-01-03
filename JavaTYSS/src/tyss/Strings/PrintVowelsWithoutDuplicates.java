package tyss.Strings;

import java.util.LinkedHashSet;

public class PrintVowelsWithoutDuplicates {

	public static void main(String[] args) {
		
		
String s="abhijith ahuja";
LinkedHashSet<Character>set=new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}
int count=0;
for(Character c:set)
{
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		count++;
		System.out.println(c);
	}
}
System.out.println(count);
	}

}
