package tyss.Strings;

public class StringReverseWithSpace_PrakashSir_ClassPgm {

	public static void main(String[] args) {
		
//String s="i love tyss";//o/p=s syte voli
String s="i am selenium";
	String s1=s.replaceAll(" ", "");
	System.out.println(s1);
	int count=s1.length()-1;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			System.out.print(s1.charAt(count--));
		}
		else
		{
			System.out.print(s.charAt(i));
		}
	}
		System.out.println();
	/*for(int i=0,j=s1.length()-1;i<s.length();i++)	
	{
	if(s.charAt(i)!=' ')
	{
		System.out.print(s1.charAt(j--));
	}
	else
	{
		System.out.print(s.charAt(i));
	}*/
		
		
	
		

}
}
