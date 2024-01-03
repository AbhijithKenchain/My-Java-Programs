package tyss.Strings;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="i am software engineer";
String a[]=input.split(" ");
for(int i=a.length-1;i>=0;i--)
{
	System.out.print(a[i]+" ");
}
	}

}
