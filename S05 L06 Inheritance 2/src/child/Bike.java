package child;

import parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		
		this.handle="long";
	}

	public Bike(String handle) {
		
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}
	
}
