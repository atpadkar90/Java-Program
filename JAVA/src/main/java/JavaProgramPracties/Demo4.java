package JavaProgramPracties;

public class Demo4 {

	public static void main(String[] args) {
		
		int []a= {1,5,6,8,2,10,5,14};
		
		int max= a[0];
		
		for(int i=0;i<a.length;i++)
			
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Frist max number " +max );

	}

}
