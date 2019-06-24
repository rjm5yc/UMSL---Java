package assignment1;

public class Prime 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Prime numbers between 1 and 10");
		
		for(int i=1; i<=10; i++) { // loop through integers 1 to 10 one by one up to integer 10 
		
		boolean checkPrime = true;
		
		for(int j=2;j<i;j++) { // check to see if the number is prime
		
		if(i%j==0) { // checks for if there is a remainder
		checkPrime = false;
		break;

		}
		}
		
		if(checkPrime)
			
			System.out.println(i + ""); // print the prime numbers
	
		}
	}
}
