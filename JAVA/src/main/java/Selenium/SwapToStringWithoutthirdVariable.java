package Selenium;

public class SwapToStringWithoutthirdVariable {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		System.out.println("Before Swaping String : "+a);
		System.out.println("Before Swaping String : "+b);
		
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("\n");
		
		System.out.println("Before Swaping String : "+a);
		System.out.println("Before Swaping String : "+b);
		
		
		

	}

}
