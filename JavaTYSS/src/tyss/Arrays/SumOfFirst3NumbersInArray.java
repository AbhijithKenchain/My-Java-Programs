package tyss.Arrays;

public class SumOfFirst3NumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {8,9,6,2,3,1,4,5};

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		//	if(a[i]<a[j])//for sum of 3 largest numbers
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	
}
int sum=0;
for(int i=0;i<3;i++)
{
	sum =sum+a[i];
}
System.out.println("sum of first 3 min numbers is   "+sum);

//System.out.println("sum of first 3 max numbers is   "+sum);
	}

}
