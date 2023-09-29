package Selenium;

import java.util.Set;
import java.util.TreeSet;

public class SortNameUsingTreeSet {

	public static void main(String[] args) {
		String a[]={"sagar","vishnu","ujju","amit"};
	     
		 //   int a[]={1,3,5,-7,9,-2,6};
		     
		   Set s=new TreeSet();
		   
		    for (Object xyz:a)
		    {
		       s.add(xyz);
		    }
		    for(Object abc:s)

		    {
		    	System.out.println(abc+ " ");
		    }
	}

}
