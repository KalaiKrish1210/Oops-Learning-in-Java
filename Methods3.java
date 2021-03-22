package Oops;

class SampleMethod {
	// Class declaration
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int e = 5;
	int result;

	public void perform() {
		// Method creating - " public- Access modifier, void - return type, perform()-
		// method name"
		result = a + b + c + d + e;

	}

}

public class Methods3 {
	public static void main(String[] args) {
		SampleMethod samplemethod = new SampleMethod();
		// Object Declaration
		samplemethod.perform();
		//Method calling
		System.out.println(samplemethod.result);

	}

}
