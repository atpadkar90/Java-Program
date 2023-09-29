package Selenium;

public class ReverseStringSpilt {

	public static void main(String[] args) {
		
		String a="Sagar Pandurang ATpadkar";
	
		String []b=a.split(" ");
		
		
		
	//System.out.println(b.length);
	
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
	

	
	}

}
