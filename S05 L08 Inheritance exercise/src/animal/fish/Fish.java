package animal.fish;

import animals.Animals;

public class Fish extends Animals {
	protected boolean waterBone = true;
	protected boolean gills = true;

	public Fish() {
		this.animalType = "Fish";
		this.bloodType = "Warm";
		this.weightInKilos = 5;
		this.waterBone = true;
		this.gills = true;
	}

	public String showInfo() {
		return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
