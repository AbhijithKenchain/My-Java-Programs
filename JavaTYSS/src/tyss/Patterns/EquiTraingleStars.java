package tyss.Patterns;

public class EquiTraingleStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
			System.out.println();
		}
		int n1=5;
		for(int i=1;i<=n1;i++)
		{
			for(int j=i;j<=n1;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k);
				}
				for(int l=i-1;l>=1;l--)
				{
					System.out.print(l);
				}
			System.out.println();
		}
	}

}
