package tyss.Strings;

public class ReverseAPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Appa";
String pali="";

for(int i=s.length()-1;i>=0;i--)
{
	pali=pali+s.charAt(i);
}
if(pali.equalsIgnoreCase(s))
{
	System.out.println("String is palindrome   "+s);
}
else {
	System.out.println("not a palindrome string "+s);
}


	}

}
