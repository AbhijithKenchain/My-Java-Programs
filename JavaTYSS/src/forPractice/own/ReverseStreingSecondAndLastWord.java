package forPractice.own;

public class ReverseStreingSecondAndLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="i am software engineer and unemployed";
		
		String[] str = s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			String st = str[i];
			if(i%2!=0) {
			for(int j=st.length()-1;j>=0;j--)
			{
				String temp="";
				temp=temp+st.charAt(j);
				System.out.print(temp);
				
				//System.out.print(st.charAt(j));		
		}
			System.out.print(" ");
	}
			else
			{
				System.out.print(str[i]+" ");
			}

}
	}
}


