package Interfaces;

interface example1{  
void print();  
//void show();      putting in comment,because of unimplemented method error in class
}  
//we have to implement all methods of interfaces
public class Q2solution implements example1 {
	//error occurs due to unimplement method of interface
	public void print(){
		System.out.println("Hello");
		}  

	public static void main(String[] args) {
		Q2solution obj = new Q2solution();  
		obj.print();  


	}

}
