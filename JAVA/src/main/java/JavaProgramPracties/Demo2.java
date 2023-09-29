package JavaProgramPracties;

public class Demo2 {
	
	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("selenium");
		StringBuffer b=sb.reverse();
		System.out.println(b);
		System.out.println(sb.capacity());
		System.out.println(sb.delete(2, 5));
		
		
	}

}
