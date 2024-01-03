package forPractice.own;

public class FirstAndSecondMinWithoutBubbleSort {

	public static void main(String[] args) 
	{
	
		int []a= {10,5,6,7,8,4,3,2,9,11,1};
		int fmin=a[0];
		int fmax=0;
		int smin=a[1];
		int smax=0;
		
		for(int b:a)
		{
			if(fmin>b)
			{
				fmin=b;
			}
			if(fmax<b)
			{
				fmax=b;
			}
		}
		for(int b:a)
		{
			if(b>fmin && b<smin)
			{
				smin=b;
			}
			if(b<fmax && b>smax)
			{
				smax=b;
			}
		}

		System.out.print("["+fmax+",");
		System.out.print(smax+",");
		System.out.print(fmin+",");
		
		
		System.out.print(smin+"]");
		
			}

}
