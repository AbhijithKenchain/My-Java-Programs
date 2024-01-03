package tyss.Numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=30;
		for(int i=2;i<=num;i++)
		{
			boolean flag=true;
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=false;
				break;
				
			}
		}
			if(flag)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
