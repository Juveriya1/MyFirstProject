package AccessModifiers;

public class Q4solution {

	public static void main(String[] args) {
		sub1 ob=new sub1();
		ob.func();
	}
}
class sub1{
	public int a=10;
	public void func() {
		System.out.println(a);
	}

}