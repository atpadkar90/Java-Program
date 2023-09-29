package Selenium;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromStrin {

	public static void main(String[] args) {
String abc ="cucumber";
		
		HashSet<Character> s = new LinkedHashSet<Character>();
		char c [] = abc.toCharArray();
		String d = "";
		String e="";
		for(Character a:c)
		{
			if(s.add(a))
			{
				d=d+a;
			}
			
		}
		System.out.println(d);
		System.out.println(e);
		

	}

}
