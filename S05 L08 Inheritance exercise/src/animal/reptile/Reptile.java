package animal.reptile;

import animals.Animals;

public class Reptile extends Animals {
	protected String skin, egg;
	protected boolean backbone;

	public Reptile() {
		heightInFeet = 5;
		weightInKilos = 20;
		animalType = "Reptile";
		bloodType = "Cold";
		this.skin = "Dry skin";
		this.backbone = true;
		this.egg = "soft shelled";

	}

	public String showInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
