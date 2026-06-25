package day2;

public class Program3_ElseifCondition {

	public static void main(String[] args) {

		int num=30;
		
		if(num==0)
		{
			System.out.println("Zero Number");
		}
		else if(num%2==0)
		{
			System.out.println("Even number");
		}
		else if(num%5==0)
		{
			System.out.println("Multiple of 5"); // cannot print becoz of prvs condition was statishfied
		}
		else
		{
			System.out.println("could not guess");
		}
	}

}
