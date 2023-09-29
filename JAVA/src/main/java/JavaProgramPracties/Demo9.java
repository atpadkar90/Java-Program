package JavaProgramPracties;

import java.util.Arrays;

public class Demo9 {

	public static void main(String[] args) {
		
		String a="B3A2C";
		
		
		
		
		char []b=a.toCharArray();
		
		Arrays.sort(b);
		
		for(int i=0;i<=b.length-1;i++)
		{
			if(Character.isAlphabetic(b[i]))
			{
				System.out.print(b[i]);
				
			}
			
			else
			{
				System.out.println(b[i]);
			}
			
		}
		

//	String b=a.replaceAll("[1-9]"," ");
//	System.out.println(b);
//	String d=a.replaceAll("[^1-9]"," ");
//	System.out.println(d);
	
		
		

	}

}
