package forPractice.own;

public class PrintOnlyNumbersFromStringInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="2ghjf23uijk789pi99";
		String[] sp = s.split("[A-Za-z]");
		boolean flag=false;
		for(int i=sp.length-1;i>=0;i--)
		{
			if(!sp[i].equals("")&& flag)
			{
				System.out.print(","+sp[i]);
			}
			else if(!sp[i].equals(""))
			{
				
				System.out.print(sp[i]);
				flag=true;
			}
			/*else
			{
				System.out.print(sp[i]);
			}*/
		}
		
		
	}

}
