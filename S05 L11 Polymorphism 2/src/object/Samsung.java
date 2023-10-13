package object;

public  class Samsung extends Phone {

	public Samsung(String model) {
		super(model);
		this.model= model;
	}
	public void features() {
		System.out.println("Premium Phone ");
		
	}
	public String getModel() {
		return model;
	}
}
