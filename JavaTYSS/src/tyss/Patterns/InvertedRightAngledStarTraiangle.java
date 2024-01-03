package tyss.Patterns;

public class InvertedRightAngledStarTraiangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		System.out.println("------------------------");
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		int k=5;
		for(int i=1;i<=k;i++)
		{
			//for(int j=1;j<=i;j++)//for rightangeled traingle
				for(int j=i;j<=n;j++)//for inverted right angled triangle
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		int l=5;
		for(int i=l;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(l-- +" ");
			}
			System.out.println();
		}
	}

}
