package tyss.Arrays;

public class ProductOfFirst3NumbersArray {

	public static void main(String[] args) {
		
int []a= {4,2,6,7,9,5,3};

for (int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
			//if(a[i]<a[j]) for bigg numbers product
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
	int product=1;
	for(int i=0;i<3;i++)
	{
		product=product*a[i];
		}
	System.out.println(product);
}
	

}
