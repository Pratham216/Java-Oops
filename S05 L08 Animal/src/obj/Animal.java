package obj;

public class Animal {
	private float heightInFeet;
	private float weightInKilos;
	private String animalType;
	private String bloodType;
	
	public Animal() {
		this.heightInFeet= 0;
		this.weightInKilos =0;
		this.animalType= "unkown";
		this.bloodType="unkown";
		
	}

	public String showInfo() {
		return "Animal [heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType="
				+ animalType + ", bloodType=" + bloodType + "]";
	}
	
		
	}


