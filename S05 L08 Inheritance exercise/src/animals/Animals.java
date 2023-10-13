package animals;

public class Animals {
	protected float heightInFeet;
	protected float weightInKilos;
	protected String animalType;
	protected String bloodType;

	public Animals() {

		this.heightInFeet = 0;
		this.weightInKilos = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
	}

	public String showInfo() {
		return "Animals [heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType="
				+ animalType + ", bloodType=" + bloodType + "]";
	}

}
