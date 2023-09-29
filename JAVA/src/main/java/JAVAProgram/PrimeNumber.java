package JAVAProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		///rime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
		//In other words, prime numbers can't be divided by other numbers than itself or 1. 
		//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

		//write a program to given number is prime or not
		
		int a=11;
		boolean prime=true;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				prime=false;
			}
			
		}
		System.out.println(prime);
   
	}	

}
