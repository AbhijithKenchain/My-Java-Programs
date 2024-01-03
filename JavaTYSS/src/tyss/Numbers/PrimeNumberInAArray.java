package tyss.Numbers;

public class PrimeNumberInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {7,4,2,1,9,8,3};

for(int i=0;i<a.length;i++)
{
	if(a[i]==2)
	{
		System.out.print(a[i]+" ");
	}
	else if(a[i]>2 && a[i]%2==1)
	{
		System.out.print(a[i]+" ");
	}
	
}


	}

}
