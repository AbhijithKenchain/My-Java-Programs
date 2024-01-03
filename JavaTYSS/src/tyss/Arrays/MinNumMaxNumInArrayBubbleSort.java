package tyss.Arrays;

public class MinNumMaxNumInArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {7,5,3,9,5,1,2,8,4};
		

		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
					//for min   if(a[i]>a[j]) 
					//for max if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					
				}
			}
		}
		System.out.print("Minimum number in array ------->"+a[0]);
		System.out.println();
		System.out.println("Maximum number in array after sorting---->"+a[a.length-1]);
	}
	}

	

