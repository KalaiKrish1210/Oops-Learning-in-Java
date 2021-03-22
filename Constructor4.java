package Oops;

class SampleConstructor {
	int Num1, Num2, Result;

	public SampleConstructor(int num1, int num2) {

		Num1 = num1;
		Num2 = num2;
	}

}

public class Constructor4 {
	public static void main(String[] args) {
		SampleConstructor obj = new SampleConstructor(2, 3);
		System.out.println("Num1 :"+ obj.Num1 +"\nNum2 :" +obj.Num2);

	}

}