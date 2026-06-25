package day1;

public class Program5_Typecasting {

	public static void main(String[] args) {
		
		
		//DOWNCASTING OR EXPLICIT TYPE CONVERSION / widening /casting required manual
		float height=162.5f;
		int heightint=(int)height;
		System.out.println(heightint);
		
		//Upcasting OR IMPLICIT TYPE CONVERSION / narrow / no casting required automatic
		int age=32;
		float ageFloat=age;
		System.out.println(ageFloat);

	}

}
 // what is type casting and explain as simple?
		//Type Casting is the process of converting one data type into another.
		//Implicit/Up casting/Widening = Smaller type to bigger type (Automatic).
		//Explicit/Down casting/Narrowing = Bigger type to smaller type (Manual using (type)).
