package Selenium;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="MADAM";
		String c="";
		for(int i=a.length()-1;i>=0;i--)
		{
			
			c=c+a.charAt(i);
		
		}
		
		System.out.println(c);
		
		if(c.equals(a))
		{
			System.out.println("String is plaindrom");
			
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}

}
