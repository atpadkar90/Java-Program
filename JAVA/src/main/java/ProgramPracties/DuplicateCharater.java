package ProgramPracties;

import java.util.LinkedHashSet;

public class DuplicateCharater {

	public static void main(String[] args) {
//		String a="Sagar Atpadkar";
//		char abc[]=a.toCharArray();
//		
//		
//		
//		LinkedHashSet hs= new LinkedHashSet();
//		
//		for(Object o:abc)
//		{
//			hs.add(o);
//		}
//		
//		for(Object xyz:hs)
//		{
//			System.out.println(xyz);
//		}
		
//		String a="Sagar Atpadkar";
//	    char a1[]=a.toCharArray();
//	    LinkedHashSet hs= new LinkedHashSet();
//
//	    for(Object b:a1) {
//	        hs.add(b);
//	    }
//	    for(Object c:hs) {
//	        System.out.println(c);
//	    }
		
		
		
		   String a="Sagar Atpadkar";

	        char []abc=a.toCharArray();

	        int i,j;

	        for(i=0; i<=abc.length; i++) {
	            for(j=i+1; j<abc.length; j++) {
	                if(abc[i]==abc[j]) {
	                    System.out.print(abc[j]);
	                    break;
	                }
	            }
	        }	
		
		
		
		
}

	}
