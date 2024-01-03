package tyss.Arrays;

public class FirstMaxNumberWithoutbubbleSort {

	public static void main(String[] args) {

		int[] a = { 7, 8, 9, 4, 5, 6 };
		int fmax = a[0];//
		for (int i = 0; i < a.length; i++) {
			// i=0 0
			// i=1
			// i=2
			// i=3
			// i=4
			// i=5
			if (fmax < a[i]) {
				fmax = a[i];
			}
		}
		System.out.println(fmax);
	}

}
