package ProgramPracties;

public class CharacterCount {

	public static void main(String[] args) {
	
		  String input = "MAHARASHTRA";

		  for(char ch='A';ch<'z';ch++)
		  {
			  int count=0;
			  
			  for(int i=0;i<input.length();i++)
			  {
				  if(ch==input.charAt(i))
					  count++;
			  }
			  if(count!=0)
			  {
				  System.out.println(ch+"  "+ count);
				  
			  }
		  }
		
		
	}

}
