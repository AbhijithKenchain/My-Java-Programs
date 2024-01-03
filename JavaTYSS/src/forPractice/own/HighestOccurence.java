
package forPractice.own;

public class HighestOccurence {
	
	
	
	public static void main(String[] args)
	{
	int []a={1,2,2,3,3,3,4,5,5,8,8,8,8,8,9,9};
	int max=0;
	int val=0;
	for(int i=0;i<a.length;i++)
	{
	int count=0;
	for(int j=0;j<a.length;j++)
	{
	if(a[i]==a[j])
	{
	if(i>j)
	{
	break;
	}
	else
	{
	count++;
	}
	}
	}
	
	if(max<count)
	{
	max=count;
	val=a[i];
	}
	}
	System.out.println(val+" "+max+"  times");
	
	}
	}


