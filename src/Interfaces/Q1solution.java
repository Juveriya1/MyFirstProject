package Interfaces;

interface example{  
void print();  
}  


public class Q1solution implements example {
	public void print(){
		System.out.println("Hello");
		}  

	public static void main(String[] args) {
		Q1solution obj = new Q1solution();  
		obj.print();  

	}

}
