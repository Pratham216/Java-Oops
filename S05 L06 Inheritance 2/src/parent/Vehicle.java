package parent;

public class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;

	public Vehicle() {
		
		this.engine = "sportz";
		this.wheels = 4;
		this.seats = 2;
		this.fuelTank = 2;
		this.lights = "rear view";	
	}
	
	
	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}


	public String getEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
	public int getSeats() {
		return seats;
	}
	public int getFuelTank() {
		return fuelTank;
	}
	public String getLights() {
		return lights;
	}
 
}
