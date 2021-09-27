package thisSuper;

public class Q5solution {

	public static void main(String[] args) {
		//Call constructor of the parent class using super()
		@SuppressWarnings("unused")
		Dog d=new Dog();  

	}

}

class Animal{  
	Animal(){
		System.out.println("animal is created");
		}  
}  
class Dog extends Animal{  
	Dog(){  
		super();  
		System.out.println("dog is created");  
	}  
}  