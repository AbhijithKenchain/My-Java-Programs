package debug;

public class Recurssion {

	public static void main(String[] args) {
		
		String s="india";
		rev(s,s.length()-1);
		
	}
	public static void rev(String s,int len)
	{
		
		if(len>=0)
		{
			System.out.print(s.charAt(len--));
			
			rev(s,len);
		}
	}
}
