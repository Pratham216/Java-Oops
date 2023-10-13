package animal.fish;

public class whale extends Fish {
	protected String size;

	public whale() {
		super();
		this.heightInFeet = 10;
		this.weightInKilos = 1500;
		this.size = "huge";
	}

	public String showInfo() {
		return "whale [size=" + size + ", waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet="
				+ heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

}
