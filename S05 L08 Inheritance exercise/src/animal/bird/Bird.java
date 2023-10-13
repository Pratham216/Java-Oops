package animal.bird;

import animals.Animals;

public class Bird extends Animals {
	protected boolean feather = true;
	protected boolean canFly = true;
	protected String beak;

	public Bird() {
		this.bloodType = "Warm";
		this.animalType = "Bird";
		this.weightInKilos = 30;
		this.heightInFeet = 2;
		this.feather = true;
		this.canFly = true;
		this.beak = "yes";
	}

	public String showInfo() {
		return "Bird [feather=" + feather + ", canFly=" + canFly + ", beak=" + beak + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
