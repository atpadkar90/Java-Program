package Selenium;

public class MaxNunmber {

	public static void main(String[] args) {
		
		int a[]={50,100,1005,200,30};
		
		int max=a[0];//50
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
				
			{
				max=a[i];
			}
		}
System.out.println(max);
	}

}
