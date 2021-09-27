package MethodOverloading;

public class Q1solution {

	public static void main(String[] args) {
		/*Write two methods with the same name but different number of parameters of same type
		and call the methods from main method*/
		sum();
		sum(5);

	}
	static void sum() {
		int a=5,b=10;
		System.out.println(a+b);
	}
	static void sum(int a) {
		int b=10;
		System.out.println(a+b);
	}

}
