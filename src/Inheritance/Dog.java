package Inheritance;

//Create a child class that  will inherit from Animal by extending the Animal class
public class Dog extends Animal{

	public Dog(String name, String talk, String walk) {
		super(name, talk, walk);
		
	}
	
//	Call the attributes
	public void see() {
		System.out.println("I can see!");
	}
	public void tail() {
		System.out.println(name+" have a tail!");
	}
	public void type() {
		System.out.println(name +" is a domestic animal");
	}
}

//Check if a class can have multiple inheritance
//public class Dog extends Family{
//	
//}
