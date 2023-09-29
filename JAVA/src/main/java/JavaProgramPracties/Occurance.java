package JavaProgramPracties;

public class Occurance {

	public static void main(String[] args) {
	
		String str="selenium";
		
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
