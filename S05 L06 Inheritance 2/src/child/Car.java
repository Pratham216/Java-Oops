package child;
import parent.Vehicle;

public class Car extends Vehicle {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	public Car() {
		super();
		this.steering = "power steering";
		this.musicSystem = "supersonic";
		this.airConditioner = "super cool ";
	}
	public Car(String steering, String musicSystem, String airConditioner) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	
}
