package animal;

import obj.Animal;

public class Bird extends Animal {
	private boolean feathers;
	private boolean canFly;
	private String beaks;
	
	
	public Bird() {
		super();
		this.feathers = true;
		this.canFly = true;
		this.beaks = "long";
	}

}
