package Constructors;

public class Q2solution {

	public static void main(String[] args) {
		// Call the constructors(both default and argument constructors) of super class from a child class
		@SuppressWarnings("unused")
		sub s=new sub();

	}

}

class construct{
	construct(){
		System.out.println("super class constructor");
	}
}
class sub extends construct{
	sub(){
	super();
	}
}