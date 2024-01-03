package tyss.Strings;

public class PrintVowelsWithDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="india";
char[]st=s.toCharArray();

int count=0;
for(int i=0;i<st.length;i++)
{
	if(st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u')
	{
		count++;
		System.out.println(st[i]);	
	}
	
}
System.out.println("with duplicates values----->"+count);




	}

}
