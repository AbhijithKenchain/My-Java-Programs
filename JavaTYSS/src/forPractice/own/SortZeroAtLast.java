package forPractice.own;

public class SortZeroAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {0,5,0,4,0,6,0};
		int count=0;
		for(int b:a)
		{
			if(b==0)
			{
				count++;
			}
			else {
				System.out.print(b+" ");
			}
		}
		while(count>0)
		{
			System.out.print(0+" ");
			count--;
		}
		
	
	}

}
