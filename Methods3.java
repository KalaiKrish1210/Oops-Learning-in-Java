package Oops;

class SampleMethod {
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int e = 5;
	int result;
	
	public void perform() {
		 result= a+b+c+d+e;
		
	}

}

public class Methods3 {
	public static void main(String[] args) {
		SampleMethod samplemethod = new SampleMethod();
		samplemethod.perform();
		System.out.println(samplemethod.result);

	}

}
