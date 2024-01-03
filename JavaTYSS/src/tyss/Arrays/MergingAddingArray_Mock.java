package tyss.Arrays;

public class MergingAddingArray_Mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };
		int b[] = { 2, 4, 6, 8 };
		int c[] = {};
if(a.length>b.length)
{
		for (int i = 0; i < a.length; i++) {

			a[i] = a[i] + b[i];
			System.out.println(a[i]);

		}
		System.out.println(a[a.length-1]+" ");
}
else
{
	for (int i = 0; i < a.length; i++) {

		a[i] = a[i] + b[i];
		System.out.println(a[i]);

	}
	System.out.println(b[b.length-1]+" ");
}
	}
}
