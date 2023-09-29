package JavaProgramPracties;

public class Fibano {

	public static void main(String[] args) {
		
		int i,n1=0,n2=1,n3,count=10;
		
		for(i=2;i<=count;i++)
		{
			
			n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;//1
			n2=n3;//1
		}

	}

}
