package JAVAProgram;

public class ReverseWithSplit {

	public static void main(String[] args) {
		
		String a="Sagar Atpadkar";
		String []b=a.split(" ");
	
		
		for(int i=0;i<=b.length-1;i++)
		{
				String c=b[i];
				String d="";
				for(int j=c.length()-1;j>=0;j--)
				{
					d=d+c.charAt(j);
				}
				System.out.println(d);
	}
		//System.out.println(d);
}
}
