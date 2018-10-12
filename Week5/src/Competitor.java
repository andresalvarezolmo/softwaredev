/**
@author andresalvarezolmo
@version 1.0
*/


public class Competitor {

	// creates fields for name and address
	
	private String name;
	private String address;

	
	/**
     * Constructor for objects of class DVD
     * Set default values for all fields
     */	
	
	public Competitor () {
		name = " ";
		address = " ";
		
	}
	
	public void printDetails () {
		
		System.out.println("Competitor Name : " + getName());
		System.out.println("Competitor Address : " + getAddress());

	}
	public Competitor(String name, String address) {
		this.name = name;
		this.address = address;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
