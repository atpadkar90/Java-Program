  package Practice;

public class ReversString {

	public static void main(String[] args) {
	
		String s="Automaton";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		StringBuffer s1= new StringBuffer("Sagar");
		System.out.println(s1.reverse());
	
	
	StringBuilder s2= new StringBuilder("Selenium");
	System.out.println(s2.reverse());
	
	}
	

}
