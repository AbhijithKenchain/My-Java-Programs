package forPractice.own;

public class OccurenceOfWord {

	public static void main(String[] args) {
	
		
		String s="hi hello hi hello customer";
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
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
				if(count>=1)
				{
					System.out.println(s1[i]+" "+count);
				}
			}
		}

	}


