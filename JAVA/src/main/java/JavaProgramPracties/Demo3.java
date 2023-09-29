package JavaProgramPracties;
import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		
		
		
//		 String str="Java";
//	       
//	        System.out.println("character"+ " "+" occurance ");
//	       
//	       for (char ch='A' ;ch<='z';ch++)
//	       {
//	       
//	       int count=0;
//	       for (int i=0;i<str.length();i++)
//	       {  
//	           if (ch==str.charAt(i))
//	           count++;
//	       }
//	      
//	      if (count!=0)
//	      System.out.println(ch+ "            "+count);

		
		

		String str="java";
		
		for(char ch='A';ch<'z';ch++)
		{
			int count=0;
			
			for(int i=0;i<=str.length()-1;i++)
			{
				
				if(ch==str.charAt(i))
						count++;
										
			}
			
				if(count!=0)
					System.out.println(ch+" "+ count);
		  }
		}
	
	
	}
		
		



