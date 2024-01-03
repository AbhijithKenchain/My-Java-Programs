package tyss.Patterns;

public class RightAngledTraingle_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(i+" ");
		
	}
	System.out.println();
}
System.out.println("---------------");
int k=5;
for(int i=1;i<=k;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(j+" ");
		
	}
	System.out.println();
}
System.out.println("================");
int o=5;
for(int i=1;i<=o;i++)
{
	for(int j=1;j<=i;j++)
	{
		if(i%2==0)
		{
			System.out.print("2 ");
		}
		else
		{
			System.out.print("1 ");
		}
	}
		System.out.println();
	
}

int a=5;
char ch='A';
for(int i=0;i<=a;i++ )
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(ch++ +" ");
	}
	System.out.println();
}
	}

}
