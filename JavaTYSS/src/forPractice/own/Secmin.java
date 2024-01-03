package forPractice.own;

public class Secmin {

	public static void main(String[] args) 
	{

		int[] a = {10, 5, 9, 8, 7, 14};
		int fmin = a[0];

		int smin = a[0];

		for (int b : a) 
		{
			if (fmin > b) 
			{
				fmin = b;
			}

		}
		for (int b : a)
		{
			if (b > fmin && b < smin) 
			{
				smin = b;
			}

		}

		System.out.print(fmin + ",");

		System.out.print(smin + "");

	}

}
