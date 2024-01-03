package tyss.Strings;

public class ReverseString_3_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t="GARA";
		String des="";
		System.out.println("before reversing String is----->"+t);
		char []c=t.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			des=des+c[i];
		}
			System.out.println(des);
	

			
			
			String des1="";
			for(int i=t.length()-1;i>=0;i--)
			{
				 des1=des1+t.charAt(i);
			}
			System.out.println(des1);
	
	String s="AMAR";
	char[]st=s.toCharArray();
	int count=0;
	for(char ch:st)
	{
		count++;
	}
	for(int i=count-1;i>=0;i--)
	{
		System.out.print(st[i]);
	}
	
	System.out.println();
	
	for(int i=0;i<st.length/2;i++)
	{
		char temp=st[i];
		st[i]=st[st.length-1-i];
		st[st.length-1-i]=temp;
	}
	for(char tc:st)
	{
		System.out.print(tc);
	}
	}

}
