package MethodOverloading;

public class Q4solution {

	public static void main(String[] args) {
		/* Write two methods with the same name and same number of parameters of different
		type and call from main method*/
		sum();
		sum(5.0f);

	}
	static void sum() {
		int a=5, b=10;
		System.out.println(a+b);
	}
	static float sum(float a) {
		int b=10;
		return(a+b);
	}

}
