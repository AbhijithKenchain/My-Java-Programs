package tyss.Arrays;

public class Swap2NumbersUsing3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=5;
		int temp=0;
		System.out.println("before swapping value of a ------>"+a);

		System.out.println("before swapping value of b------>"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping value of a------>"+a);
		System.out.println("after swapping value of b------>"+b);
	}

}
