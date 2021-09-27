package Constructors;

public class Q1solution {

	public static void main(String[] args) {
		/* Write a class with a default constructor, one argument constructor and two argument
		constructors. Instantiate the class to call all the constructors of that class from a main
		class*/
		@SuppressWarnings("unused")
		construc ob=new construc();
		@SuppressWarnings("unused")
		construc ob1=new construc(5);
		@SuppressWarnings("unused")
		construc ob2=new construc(5,10);

	}

}

class construc{
	construc(){
		System.out.println("default constructor");
	}
	construc(int a){
		System.out.println("single parametrized constructor value="+a);
	}
	construc(int a,int b){
		System.out.println("two parametrized constructor value="+(a+b));
	}
}