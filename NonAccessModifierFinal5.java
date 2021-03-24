package Oops;

class Final{
	//class declaration 
	final int a = 12;
	// If you the use the final keyword to declare for a variable it is a constant one.
	final int b = 14;
	//final keyword variable declaration
}

public class NonAccessModifierFinal5 {

	public static void main(String[] args) {
		Final obj = new Final();
		//object creation
		obj.a=10;
		// the a varible is declared by final. So, the replacement of the a variable getting error.
		obj.b=20;
		// the a varible is declared by final. So, the replacement of the b variable getting error.
		System.out.println(obj.a +" "+ obj.b );
	}

}
