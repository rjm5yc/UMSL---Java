package practice;

public class practice 
{
	public static void main(String[] args) ///running = .75 X Weight Walking .53 X weight name age weight
	{
	
	String Name = "Mike"; // Enter Name between " " 
	int weight = 150; // Enter Weight in LBS - Must be an integer	
	int age = 35; // Enter Age here 
	double miles = 10;	// Enter Distance in miles here 
	double run = .75; 
	double walk = .53;
	
	
	
			
	System.out.println("Name: " + Name);
	System.out.println("Age: " + age + " Years Old");
	System.out.println("Weight: " + weight + " LBS");
	System.out.println("Distance: " + miles + " Miles");
	System.out.println("Per Mile Walking Calories Burned: " + walk * weight);
	System.out.println("Per Mile Running Calories Burned: " + run * weight);
	System.out.println("Total Walking Calories Burned: " + walk * weight * miles);
	System.out.println("Total Running Calories Burned: " + run * weight * miles);
	
	}

}
