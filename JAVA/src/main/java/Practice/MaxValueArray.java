package Practice;

public class MaxValueArray {

	public static void main(String[] args) {
		
		int a[]= {1,5,8,10,9,7,6};
		
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		if(a[i]>max)
		{
			max=a[i];
		}
		 System.out.println(max);

	}

}
