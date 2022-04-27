package Inheritance;

//Create a child class that  will inherit from Animal by extending the Animal class
public class Snake extends Animal {

	public Snake(String name, String talk, String walk) {
		super(name, talk, walk);
		
	}
	
//	Call the attributes
	public void see() {
		System.out.println("I can see!");
	}
	public void tail() {
		System.out.println(name+" does not have a tail!");
	}
	public void type() {
		System.out.println(name +" is not a domestic animal");
	}
}
