package JavaProgramPracties;

public class RemoveNumber {

	public static void main(String[] args) {
		String str="sagar123!@#$%1234";

		char[] b=str.toCharArray();
		
		for(int i=0;i<=b.length-1;i++)
		{
			
			if(Character.isDigit(b[i]))
			{
				System.out.print( b[i]);
			}
			
			else if(Character.isAlphabetic(b[i]))
			{
				System.out.println(b[i]);
				
			}
			else
			{
				System.out.println(b[i]);
			}
		}

	}

}
