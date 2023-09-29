package Selenium;

public class DuplicateStringinArray {

	public static void main(String[] args) {
		
		String []abc= {"abc","bcd","abc","pqr","xyz","pqr"};
		
		for(int i=0;i<=abc.length-1;i++)
		{
			for(int j=i+1;j<abc.length;j++)
			{
				if(abc[i]==abc[j])
				{
				System.out.println(abc[j]);
				}
			}
			
		}
		
	
		

	}

}
