package Interfaces;

interface defaulT{
	void msg();
	default void print() {
		System.out.println("i'm default method");
	}
}

class sb implements defaulT{
	public void msg() {
		System.out.println("hello");
	}
}
public class Q6solution {

	public static void main(String[] args) {
		sb o=new sb();
		o.msg();
		o.print();

	}

}
