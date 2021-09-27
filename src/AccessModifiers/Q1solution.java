package AccessModifiers;

public class Q1solution {
	private static int a=10;		//without static,we can't print in another scope as it's private member
	private static void func() {	//without static,we can't print in another scope as it's private method
		System.out.println("i'm private method");
	}

	public static void main(String[] args) {
		System.out.println(a);
		func();

	}

}
class sub extends Q1solution{
	//we can't access private member or methods in sub class as it's scope is only for it's own class
	//System.out.println(a);		error
	//func();						error
}
