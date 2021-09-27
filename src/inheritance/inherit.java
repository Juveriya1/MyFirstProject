package inheritance;

public class inherit {

	public static void main(String[] args) {
		A ob=new A();
		B ob1=new B();
		C ob2=new C();
		A obj1=new B();		//UpCasting runtime PolyMorphism
		B obj2=new C();		//UpCasting runtime PolyMorphism
		ob.Afunc();
		ob.Afunc2();
		ob1.Bfunc1();
		ob1.Bfunc2();
		ob2.Cfunc1();
		ob2.Cfunc2();
		obj1.sum();
		obj2.sum();
		ob1.callA();
		ob2.callB();
		

	}

}
class A{
	int a=10;
	void Afunc() {
		System.out.println("i am method of class A");
	}
	void Afunc2() {
		System.out.println("class A method printing a value="+a);
	}
	void sum() {
		String a="15",b="10";
		String s=a+" "+b;
		System.out.println(s);
	}
}

class B extends A{
	void Bfunc1() {
		System.out.println("i am method1 of class B");
	}
	void Bfunc2() {
		System.out.println("i am method2 of class B");
	}
	void sum() {
		int a=15,b=10;
		int s=a+b;
		System.out.println(s);
	}
	void callA() {
	super.sum();
	}
}

class C extends B{
	void Cfunc1() {
		System.out.println("i am method1 of class C");
	}
	void Cfunc2() {
		System.out.println("i am method2 of class C");
	}
	void sum() {
		float a=15,b=10;
		float s=a+b;
		System.out.println(s);
	}
	void callB() {
		super.sum();
	}
}