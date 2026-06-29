package day1;

public class Program4_ASCII {

	public static void main(String[] args) {

		
//		//A=65 , a=97
//		char alpha='A' ;
//		int value =alpha;
//		
//		System.out.println("ASCII CODE:"+value);
		
		//2. Print All ASCII Values from A-Z / a-z
		
//		for (char ch='A'; ch <= 'Z'; ch++) 
//		{
//			System.out.println(ch + "="+ (int)ch);
//		}
		
		//3.Convert Uppercase to Lowercase Using ASCII
		
//		char upper ='A';
//		char lower= (char)(upper+32);
//		
//		System.out.println("UpperCase="+upper);
//		System.out.println("LowerCase="+lower);
//		
		//3.Convert lowercase to uppercase Using ASCII
		
//		char lower ='a';
//		char upper = (char)(lower-32);
//		
//		System.out.println("LowerCase="+lower);
//		System.out.println("uppercase="+upper);
//	}
		
		//4.Check Whether a Character is Uppercase or Lowercase Using ASCII
		
			char ch='G';
			
			if(ch>=65 && ch<=90) 
			{
				System.out.println(ch + " is uppercase");
			}
			else if(ch>=97 && ch<=122) 
			{
				System.out.println(ch +"is lowercase");
			}
			else {
				System.out.println("Not an Alphabet");
			}
				
				
			}
}
