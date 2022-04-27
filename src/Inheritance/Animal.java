package Inheritance;

// Create a public parent class that will have some attributes that will be inherited  
public class Animal {
	
//	make the variables protected, so they can be available to all the children alone
	protected String name;
	protected String talk;
	protected String walk;
	

	public Animal(String name, String talk, String walk) {
		this.name = name;
		this.talk = talk;
		this.walk = walk;
	}
	public void see() {
		System.out.println("I can see!");
	}
	public void tail() {
		System.out.println(name+" have a tail!");
	}
	public String getName() {
		return this.name;
	}
	public String getTalk() {
		return this.talk;
	}
	public String getWalk() {
		return this.walk;
	}
	
	
	
}
