package tyss.Arrays;

public class BubbleSortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []a= {2,5,3,1,4,6};
 
 for(int i=0;i<a.length-1;i++)
 {
	 for(int j=0;j<a.length-1;j++)
	 {
		 if(a[j]>a[j+1])
			 //if(a[j]<a[j+1])
		 {
			 int temp=a[j];
			 a[j]=a[j+1];
			 a[j+1]=temp;
		 }
	 }
 }
 
 for(int t:a)
 {
	 System.out.print(t+" ");
 }
	}

}
