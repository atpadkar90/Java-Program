package JavaProgramPracties;

public class Thiredandsecondmaxnumber {

	public static void main(String[] args) {
	
		
		int []a={10,5,8,11,03,7};
		  int temp;
		  for(int i=0;i<a.length;i++)
		  {
		      for(int j=1+i;j<a.length;j++)
		      {
		          if(a[i]>a[j])
		          {
		              temp=a[i];
		              a[i]=a[j];
		              a[j]=temp;
		          }
		          for(int b:a)
		          {
		              System.out.print(b);
		          }
		        System.out.println("3rd max number in given array is:  "+a[a.length-3]);
	}
		  }}}

