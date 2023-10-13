package animal.bird;

public class Eagle extends Bird {

	public Eagle() {
		super();
		this.beak = "long";
	}

	public String showInfo() {
		return "Eagle [feather=" + feather + ", canFly=" + canFly + ", beak=" + beak + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
