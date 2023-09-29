package Selenium;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1="race";
	      String str2="care";
	      
	      char a1[]=str1.toCharArray();     
	      char a2[]=str2.toCharArray();

	      if (a1.length==a2.length)

	      {
	    	   Arrays.sort(a1);
	          
	           
	           Arrays.sort(a2);
	           
	           if (Arrays.equals(a1,a2))
	           {
	               System.out.println("String are anagram");
	           }
	           else
	           {
	        	   System.out.println("String is not anagram");
	           }
	          
	      }

	}

}
