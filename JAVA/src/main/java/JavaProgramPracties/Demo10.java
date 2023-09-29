package JavaProgramPracties;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo10 {
	
	public static void evenNumber(int start, int end)
	{
		if(start<=end)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			evenNumber(start+1, end);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Demo10 d= new Demo10();
		d.evenNumber(1, 30);
		
		
		
		
		
//		int a=10;
//		int b=20;
//		
//		System.out.println("Before swap : "+a + " "+ b);
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("AfterSwao : "+a + " "+ b);
//		
		
//		String a="ABCDE";
//		
//		System.out.println(a.substring(0, 5));
//		
//		System.out.println(a.replace("A","AB" ));
//		
	
		
		
		
		
//		String a="Hellow";
//		
//		String b="World";
//		
		
		
//		System.out.println("Before String");
//		System.out.println("String a : "+a);
//		System.out.print("String b : "+b);
		
//			a=a+b;
//			System.out.println(a);//HelloWorld
//			
//			b=a.substring(0,a.length()-b.length());
//			System.out.println(b);//HellowWorld-
//			
//			a=a.substring(b.length());
//			System.out.println(a);
//		
//		System.out.println("\n");
//			System.out.println("After String");
//			System.out.println("String a : "+a);
//			System.out.print("String b : "+b);
//		
		
//		
//		 Map<String, String> map = new LinkedHashMap<String, String>();
//
//         map.put(null,"value1");
//
//         map.put("1", "value2");
//
//         map.put(null,"null");
//
//         System.out.println(map);

		
		
//		int x=20;
//
//		  System.out.println(++x);//21
//
//        System.out.println(x++);//21+1=22
//
//        System.out.println(--x);//22-1=21
//
//        System.out.println(x--);//21-1=20
//
//        System.out.println(x);//20
//        System.out.println(x++);//20
        

	}

}
