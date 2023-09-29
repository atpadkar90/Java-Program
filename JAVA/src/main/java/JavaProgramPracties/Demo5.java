package JavaProgramPracties;

public class Demo5 {

	public static void main(String[] args) {
		
		String abc="Selenium";
		
			
		for(char ch='A';ch<='z';ch++)
		{
			int count=0;
			
			for(int i=abc.length()-1;i>=0;i--)
			{								
				if(ch==abc.charAt(i))
				{
					
					count++;
				
				}
			}
			if(count!=0)
				
			System.out.println(ch +" "+count);
			
		}
		
		
		

	}

}
