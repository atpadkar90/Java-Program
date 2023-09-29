package JavaProgramPracties;

import java.util.Arrays;

public class SortNameAraray {

	public static void main(String[] args) {
		

		  String a[]={"pallavi","sagar","amit","banty"};
		  
		  String temp;
		  
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<a.length-1;j++)
				  
			  {
				  if(a[j].compareTo(a[j+1])>0)
				  {
					  temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
				  }
			  }
		  }
		  System.out.println(Arrays.toString(a));
		
		for(int z=0;z<a.length;z++)
		{
			System.out.println(a[z]);
		}
	}

}
