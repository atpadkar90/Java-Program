package ProgramPracties;

public class ReverserNumber {

	public static void main(String[] args) {
		
		int number=12345;
		
		int reverser=0;
		
		while(number!=0)
		{
			reverser=reverser*10+number%10;
			number=number/10;
		}
		System.out.println(reverser);
		
		
		
//		int a=1234;
//		
//		String b=Integer.toString(a);
//
//		System.out.println(b);
//	
//	for(int i=b.length()-1;i>=0;i--)
//	{
//		char c=b.charAt(i);
//		System.out.println(c);
//	}
//	
	}

}
