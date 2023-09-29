package Practice;

public class ReverseIntForLoop {

	public static void main(String[] args) {
		
		
		int num=12345;
		
		int rev=0;
		
		for(;num!=0;num=num/10)
		{
		
			int reminder=num%10;
			rev=rev*10+reminder;
			
		}
	System.out.println(rev);
	}

}
