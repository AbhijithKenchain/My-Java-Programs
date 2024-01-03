package tyss.Numbers;

public class SmallestEvenNumberInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,3,2,1,7,8,4};
		int tempNum=0;
		for(int t:a)
		{
			if(t>tempNum)
			{
				tempNum=t;
			}
		}
		for(int t:a)
		{
			if(t%2==0 &&t<tempNum)
			{
				tempNum=t;
			}
		}
		System.out.println(tempNum%2==0?tempNum:"no even num in array");

}
}