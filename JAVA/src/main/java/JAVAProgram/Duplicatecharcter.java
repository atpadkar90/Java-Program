package JAVAProgram;

public class Duplicatecharcter {

	public static void main(String[] args) {
		//find the duplicate character
		
		int i,j;
		int count=0;
		String str="Sagar Atpadkar";
		
		char []ch=str.toCharArray();
		
		for(i=0;i<ch.length;i++)
		{
			
			for(j=i+1;j<ch.length;j++)
			{
				
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					count++;
				}
			}
		}
		System.out.println(count);

//		System.out.println("*******************************");
		
		
//		int [] arr= {1,5,4,4,2,1,7};
//		
//		for(int a=0;a<arr.length;a++)
//		{
//			for(int b=a+1;b<arr.length;b++)
//			{
//				if(arr[a]==arr[b])
//				{
//					System.out.println(arr[b]);
//				}
//			}
//		}
		
	}

}
