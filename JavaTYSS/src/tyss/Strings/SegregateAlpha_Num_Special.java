package tyss.Strings;

public class SegregateAlpha_Num_Special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="a1C$d3R%^";//o/p=aCdR 13 $%^
		
		
		String alpha=" ";
		String num=" ";
		String spec=" ";
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='a' && a.charAt(i)<='z'||a.charAt(i)>='A' && a.charAt(i)<='Z')
			{
				alpha=alpha+a.charAt(i);
			}
			else if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				num=num+a.charAt(i);
			}
			else
			{
				spec=spec+a.charAt(i);
			}
		}
		System.out.println(alpha+num+spec);
		System.out.println("alphabets are------> "+alpha);
		System.out.println("Numbers are------> "+num);
		System.out.println("Special characters are------> "+spec);
	}

}
