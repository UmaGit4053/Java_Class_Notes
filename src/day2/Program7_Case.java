package day2;

public class Program7_Case {

	public static void main(String[] args) {

		char ch='U';
		if(ch>='A' && ch<='Z') 
		{
			System.out.println("This letter is UpperCase");
		}
		else if(ch>='a' && ch<='z') 
		{
			System.out.println("This letter is lowercase");
		}
		else if(ch>='0' && ch<='9') 
		{
			System.out.println("This is Digit");
		}
		else
		{
			System.out.println("This is special character");
		}
	}

}
