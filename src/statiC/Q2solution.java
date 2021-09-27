package statiC;

public class Q2solution {
	static int st=20;

	public static void main(String[] args) {
		int a=10;			//instance variable
		System.out.println("instance variable vlaue="+a);
		System.out.println("static variable vlaue="+st);
		staticfunc();				//static method invocation as it is global it can invoke anywhere in the program
		//func1();					error because instance method invocation in anywhere in program is illegal because of local scope
		//func2();
	}
	static void staticfunc() {
		System.out.println("I'm static method ");
		System.out.println("instance variable and instance methods can't invoke outside of its local scope");
		//System.out.println("I'm instance variable value "+a);		error
		//func1();				error
	}
	
	//instance method it can't be invoke anywhere in the program as it's scope is local
	void func1() {
		System.out.println("I'm instance method 2");
		//to invoke this method anywhere in the program, it should be global with static keyword
		staticfunc();		//static method invocation
	}
	
	void func2() {
		System.out.println("I'm instance method 2 with static variable value is="+st);
		
	}
	
}
