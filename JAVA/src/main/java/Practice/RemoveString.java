package Practice;

public class RemoveString {

	public static void main(String[] args) {

String s1="A!a1BCD154@#";

s1=s1.replaceAll("[^0-9, A-Z]", " ");

//s1=s1.replaceAll("[^A-Z,a-z,0-9]", " ");

System.out.println(s1.trim());
	}

}
