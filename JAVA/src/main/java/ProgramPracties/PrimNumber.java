package ProgramPracties;

public class PrimNumber {

	public static void main(String[] args) {
		
		
		
		int a=4;
		boolean prime=true;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				prime=false;
			}
		}
		System.out.println(prime);
				
	}

}
