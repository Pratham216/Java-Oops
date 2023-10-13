package object;

public class Phone {
	
	private String model;

	public Phone(String model) {
		this.model= model;
		
	}
	public void features() {
		System.out.println("Beast phone");
	}
	public String getModel() {
		return model;
	}
	

}
