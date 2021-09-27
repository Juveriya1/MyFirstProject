package thisSuper;

public class Q1solution {

	public static void main(String[] args) {
	Thisdemo ob1=new Thisdemo(111,"ankit",5000f);  
	Thisdemo ob2=new Thisdemo(112,"sumit",6000f);  
		ob1.display();  
		ob2.display();

	}

}

class Thisdemo{ 
		int rollno;  
		String name;  
		float fee;  
		Thisdemo(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
		}  
		
		void display(){
			System.out.println(rollno+" "+name+" "+fee);
			}  
		  
}