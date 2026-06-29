package day2;

public class Program4_NesterdIfElse {

	public static void main(String[] args) {
		
		int age =18;
		char gender ='F';
		
		
		if(age==18) 
		{
			System.out.println("Congrats on your first vote");
			if(gender=='F')
			{
				System.out.println("Please vote girl");
			}
			else 
			{
				System.out.println("Please vote boy");
			}
		}
		if(age>=18) 
		{
			System.out.println("you can vote");
		}
		else 
		{
			System.out.println("you cannot vote");
		}
		
	}

}
