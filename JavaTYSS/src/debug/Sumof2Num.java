package debug;

public class Sumof2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start");
		
		int a=10;
		int b=20;
		int sum=0;
		sum=sum(a,b);
		System.out.println(sum);
		System.out.println("end");

	}
	public static int sum(int x,int y)
	{
		System.out.println("sum section started");
		int result=x+y;
		System.out.println("sum section ended");
		
		return result;
	}

}
