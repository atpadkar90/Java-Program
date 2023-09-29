package JavaProgramPracties;

public class SortIntArray {

	public static void main(String[] args) {
		
		
		int []a=new int[] {1,5,8,2,4,10,45,-4,-5,61,50};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ,");
		}

	}

}
