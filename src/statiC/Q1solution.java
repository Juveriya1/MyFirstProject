package statiC;

public class Q1solution {
	static int a=10,b=20;
	public static void main(String[] args) {
		int instance1= 5,instance2= 30;
		System.out.println("I'm instance variable 1 value "+instance1);
		System.out.println("I'm instance variable 2 value "+instance2);
		//func1();			invoking here will give error as it's instance method
		//func2();
		staticfunc1();
		staticfunc2();
	}
	//instance methods can't invoke in main as its scope is only for local
	void func2() {
		System.out.println("I'm instance method 2");
	}
	
	static void staticfunc1() {
		System.out.println("I'm static method 1");
		
		System.out.println("I'm static variable 1 value "+a);
	}
	static void staticfunc2() {
		System.out.println("I'm static method 2");
		System.out.println("I'm static variable 1 value "+b);
	}
}

