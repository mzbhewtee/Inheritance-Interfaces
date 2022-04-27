package Inheritance;

// Create a child class that  will inherit from Animal by extending the Animal class
public class Bird extends Animal {

	public Bird(String name, String talk, String walk) {
		super(name, talk, walk);
		
	}
	
//	Call the attributes
	public void see() {
		System.out.println("I can see!");
	}
	public void tail() {
		System.out.println(name+" has a tail!");
	}
	public void type() {
		System.out.println(name +" can either be a domestic animal or a wild animal");
	}
}
