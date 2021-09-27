package thisSuper;

public class Q6solution {

	public static void main(String[] args) {
		// Use this() and super() in methods not in constructors
		
		Emp e1=new Emp();
		e1.Record(1,"ankit",6000f);
		e1.display(); 

	}

}

class Person{  
	int id;  
	String name;  
	void Details(int id,String name){  
		this.id=id;
		this.name=name;
		}
	void disp(){
		System.out.println(id+" "+name);
		}
}  
class Emp extends Person{  
	float salary;  
	void Record(int id,String name,float salary){  
		super.id=id;
		super.name=name;
		this.salary=salary;  
	}  
	void display(){
		System.out.println(id+" "+name+" "+salary);
		}  
}  