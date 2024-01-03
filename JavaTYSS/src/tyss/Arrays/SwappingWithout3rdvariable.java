package tyss.Arrays;

public class SwappingWithout3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;

		System.out.println("before swapping   a is------>"+a);

		System.out.println("before swapping  b is------>"+b);
a=a+b;//10+20=30 now a=30;
b=a-b;//30-20=10 b is now 10 
a=a-b;//30-10=20 a is now 20

System.out.println("after swapping a------>"+a);

System.out.println("after swapping   b------>"+b);
	
	}

}
