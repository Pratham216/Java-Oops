package object;

public class Phone {

	public String model;

	public Phone(String model) {
		this.model = model;
	}

	public void features() {
		System.out.println("Beast Phone");
	}

	public String getModel() {
		return model;
	}

}
