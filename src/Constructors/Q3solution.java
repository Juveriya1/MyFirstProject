package Constructors;

public class Q3solution {

	public static void main(String[] args) {
		// Apply private, public, protected and default access modifiers to the constructor
		//constructor ob=new constructor();    error,can't invoke private constructor as it's access is not available outside the class
		@SuppressWarnings("unused")
		constructor ob1=new constructor(5);
		@SuppressWarnings("unused")
		constructor ob2=new constructor(5,10);

	}

}

class constructor{
	@SuppressWarnings("unused")
	private constructor(){
		System.out.println("default constructor");
	}
	public constructor(int a){
		System.out.println("single parametrized constructor value="+a);
	}
	protected constructor(int a,int b){
		System.out.println("two parametrized constructor value="+(a+b));
	}
}