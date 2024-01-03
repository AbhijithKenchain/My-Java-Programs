package tyss.Arrays;

public class FirstMinNumWithoutBubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {5,4,3,8,9};
int fmin=a[0];//5
		for(int i=0;i<a.length;i++)
		{
			//i=0 0<5 a[i]=5
			//i=1 
			if(fmin>a[i])
			{
				fmin=a[i];
				
			}
		}
		System.out.println(fmin);
	}

}
