package forPractice.own;

public class RemoveDuplicatesInStringWithoutCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="hi hello hi hello welcome";
		String[] st = s.split(" ");
		boolean flag[]=new boolean[st.length];
				int count=0;
				for(int i=0;i<st.length;i++)
				{
				if(!flag[i])
				{
					count=0;
					for(int j=i;j<st.length;j++)
					{
						if(st[i].equals(st[j]))
						{
							if(i>j)
							{
								break;
							}
							else
							{
								count++;
								flag[j]=true;
							}
						}
					}
					System.out.print(st[i]+" ");
				}
				}
	}

}
