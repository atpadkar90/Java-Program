package Selenium;

import java.util.ArrayList;

public class ReverStringIUsingArrayList {

	public static void main(String[] args) {

		String a = "selenium Automatoin";
		
		ArrayList arr= new ArrayList ();
		
		for(int i=a.length()-1;i>=0;i--)
		{
			char d=a.charAt(i);
		
			arr.add(d);
		}
		
		for(Object abc:arr)
		{
			System.out.print(abc);
		}
		
	}

}
