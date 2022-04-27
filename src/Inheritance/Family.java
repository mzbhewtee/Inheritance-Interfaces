package Inheritance;


// Create a class to check whether a class can have multiple inheritance
public class Family {
	
	protected String Kindom;
	protected String Phylum;
	protected String Class;
	
	public Family(String Kingdom, String Phylum, String Class) {
		this.Kindom = Kindom;
		this.Phylum = Phylum;
		this.Class = Class;
	}
	public void classify() {
		System.out.println("All animals are classified");
	}
	public String getName() {
		return this.Kindom;
	}
	public String getTalk() {
		return this.Phylum;
	}
	public String getWalk() {
		return this.Class;
	}


}
