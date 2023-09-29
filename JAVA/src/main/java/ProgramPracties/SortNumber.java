package ProgramPracties;

public class SortNumber {

	public static void main(String[] args) {
//		
//		String a="sainath";
//		
//		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1));

		
		String a="Sainath123b";
		
		
		char []b=a.toCharArray();
		
		for(int i=0;i<b.length;i++)
			
		{
			if(Character.isAlphabetic(b[i]))
			{
				System.out.print(b[i]);
			}
		}
		
		
		
		
//	String b=a.replaceAll("[0-9]","");
//	
//	System.out.println(b);
//	
	}

}
