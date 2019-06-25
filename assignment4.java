package practice;

public class assignment4 
{
	public static void main(String[] args) ///running = .75 X Weight Walking .53 X weight name age weight
	{
	
	String Name = "Mike"; // Enter Name between " " 
	int weight = 150; // Enter Weight in LBS - Must be an integer	
	int age = 35; // Enter Age here 
	double miles = 10;	// Enter Distance in miles here 
	int n = 0; // Choose 0 if walk and choose 1 if ran
	
	double run = .75; 
	double walk = .53;
			
	System.out.println("Name: " + Name);
	System.out.println("Age: " + age + " Years Old");
	System.out.println("Weight: " + weight + " LBS");
	System.out.println("Distance: " + miles + " Miles");
	if(n==0)
	System.out.println("Total Walking Calories Burned: " + walk * weight * miles);
	else
	System.out.println("Total Running Calories Burned: " + run * weight * miles);
	
	}
}
