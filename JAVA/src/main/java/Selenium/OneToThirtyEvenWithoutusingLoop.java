package Selenium;

public class OneToThirtyEvenWithoutusingLoop {

	public static void evemNumber(int start,int end)
	{
		if(start<=end)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			evemNumber(start+1,end);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		OneToThirtyEvenWithoutusingLoop.evemNumber(1,30);

	}

}
