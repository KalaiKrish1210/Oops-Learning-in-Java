package Oops;

import java.util.Scanner;
//Scanner method package importing 

class SampleStatic {
	// class declaration
	int num1;
	int num2;
	int result;

	static void Perform1() {
		// outside normal class decalartion static method and the static method is not
		// perform the local operation
		System.out.println("This is outside normal class decalartion static method ");
	}

	public void Perform2() {
		// Outside normal class public method declaration
		result = num1 + num2;
		System.out.println(result);
	}
}

public class NonAccessModifierStatic6 {
	static void Perform3() {
		// inside of the public class decalartion static method
		System.out.println("This is inside of the public class decalartion static method ");
	}

	public static void main(String[] args) {

		SampleStatic obj = new SampleStatic();
		// object creation
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the first value :");
		obj.num1 = input.nextInt();
		// Getting first input value from user
		System.out.println("Enter the Second value :");
		obj.num2 = input.nextInt();
		// Getting the second input value from user

		SampleStatic.Perform1();
		// Static method calling outside of the public class. if you want the static
		// method calling without the creation of object you have to use the clss name
		// the static method.

		obj.Perform2();
		// Public method calling outside of the public class.

		Perform3();
		// If you created the static method inside of the public class call directly the
		// method name
		// No need to create the object , no need to call the class itself

	}

}
