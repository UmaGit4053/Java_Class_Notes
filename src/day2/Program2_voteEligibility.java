package day2;

public class Program2_voteEligibility {

	public static void main(String[] args) {
		
		int age=18;
		
		
		if(age==18) //if have one line inside the block its not nessary curly base
		
			System.out.println("Congrats on your first vote");
		
		if(age>18) 
		{
			System.out.println("you can vote");
		}
		else 
		{
			System.out.println("you cannot vote");
		}

	}

}
