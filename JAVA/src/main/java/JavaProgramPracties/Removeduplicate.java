package JavaProgramPracties;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {

		String a = "sainath Gaike";
		char []abc=a.toCharArray();
		
	Set ls= new LinkedHashSet();
		
		for(Object b:abc)
		{
		ls.add(b);
			
		}
		
		for(Object x:ls)
		{
			System.out.println(x);
		}
	}

}
