package Practice;

public class ReverseIntWhileLoop {

	public static void main(String[] args) {
		 
		
		int a=1234;
		
		int rev=0;
		
		while(a!=0)
		{
			
			int reminder=a%10;
			
			rev=rev*10+reminder;
			a=a/10;
			
			
			//a=1234 reminder=1234%10=4  rev=0*10+reminder =0*10+4=4     a=a/10 = a=1234/10=123
			
			//a=123 reminder=123%10=3  rev=rev*10+reminder =4*10+3=43      a=a/10 = a=123/10=12		
			
			
		}
		 System.out.println(rev);
		
	}

}
