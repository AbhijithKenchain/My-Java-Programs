package tyss.Numbers;

public class FibonacciSeeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int fnum = 0;
		int snum = 1;
		System.out.println("fibonacci series");

		
		for (int i = 1; i <= n; i++) {
			int next = fnum + snum;
			System.out.print(fnum+" ");
			fnum = snum;
			snum = next;
		}

	}

}
