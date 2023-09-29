package Selenium;

import java.util.Arrays;

public class SortArrayName {

	public static void main(String[] args) {
	
		  String a[]={"pallavi","sagar","amit","banty"};
		     
		    //int temp;   //swap
		     
		     String temp;

		    for (int i=0;i<a.length;i++)
		    {
		        for (int z=0;z<a.length-1;z++)
		        {
		            if (a[z].compareTo(a[z+1])>0)    // only change here > =  < .compareTo method for String
		            {
		                temp=a[z];
		                a[z]=a[z+1];
		                a[z+1]=temp;
		            }
		        }
		    }
		      System.out.print(Arrays.toString(a));  
//		     for (int i=0;i<a.length;i++)    
//		     {
//		    	// System.out.println(a[i]);
//		      System.out.print(a[i]);
//		     }

	
	
	}}