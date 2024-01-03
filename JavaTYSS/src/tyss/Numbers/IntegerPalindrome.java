package tyss.Numbers;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 1221;
if(isPalindrome(a))
{
	System.out.println(a+" number is palindrome");
}
else
{
	System.out.println(a+" number is not palindrome");
}
	}

public static boolean isPalindrome(int num)
{
	int reverse=0;
	int n=num;
	while(num>0)
	{
		int r=num%10;
		reverse=reverse*10+r;
		num=num/10;
	}
	return n==reverse;
}
}
