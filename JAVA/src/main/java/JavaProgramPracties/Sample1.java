package JavaProgramPracties;

public class Sample1 extends Demo1 {
	
	
	@Override
	public void m3() {
		System.out.println("M3 method in Sample1 class");
		
	}
	
	public void s1()
	{
		System.out.println("S1 method in Sample1 class");
	}
	
	

	public static void main(String[] args) {
		
		Demo1 obj =new Sample1();
		obj.m1();
		obj.m2();
		obj.m3();
		//obj.s1();
	}

	

}
