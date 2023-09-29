package JavaProgramPracties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class StringBuffer12 {

	public static void main(String[] args) {

	HashMap hm= new HashMap();
	hm.put("FirstName","Sagar");
	hm.put("lastName","Atpadkar");
//	
//	System.out.println(hm.keySet());
	System.out.println(hm.entrySet());

	
	Collection c=hm.values();
	
	
	
	
	//Set s=hm.keySet();
	ArrayList ls= new ArrayList();
	ls.addAll(c);
	
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i));
	}
	
	
	
	
	
		
		
//		public static void main(String[] args) {
//
//			StringBuffer sb1 = new StringBuffer("Selenium ");
//
//			StringBuffer sb2 = sb1.append("Testing");
//
//			System.out.println(sb1);
//
//			System.out.println(sb2);

	}

}
