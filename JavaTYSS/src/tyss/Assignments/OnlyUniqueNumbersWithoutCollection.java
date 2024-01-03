package tyss.Assignments;

public class OnlyUniqueNumbersWithoutCollection {
	
	public static void main(String[] args) {
		
	
	int[]a= {5,4,4,2,5,4,2,1};
	// TODO Auto-generated method stub

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
	if(count==1)
	{
		System.out.println(a[i]+" repeating only ------->  "+count+" time ");
	}
}
	}
}

