package JAVAProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String a="Java";
		char[] abc = a.toCharArray();

		LinkedHashSet hs = new LinkedHashSet();

		for (Object o : abc) {
			hs.add(o);
		}

		System.out.println(hs);

//		for (Object xyz : hs) {
//			System.out.print(xyz);

	}


	}