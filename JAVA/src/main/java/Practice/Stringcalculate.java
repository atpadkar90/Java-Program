package Practice;

public class Stringcalculate {

	public static void main(String[] args) {
		
		String str="ja2v3a5";
		
		int add=0;
		
		char[]abc=str.toCharArray();
	
		for(int i=0;i<abc.length;i++)
		{
			
			if(Character.isDigit(abc[i]))
			{
				//System.out.println(abc[i]);
				//int num = (int) abc[i];//ascii code
				int num =Character.getNumericValue(abc[i]);//char to int
				add=add+ num;
				//System.out.println(add);
			}
		}
		System.out.println(add);
		
	}

}
