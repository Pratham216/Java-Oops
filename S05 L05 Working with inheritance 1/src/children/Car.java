package children;

import parent.Vehicle;

public class Car extends Vehicle{
	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String fridge;
	public String entertainmentSystem;
	public String getSteering() {
		return steering;
	}
	public void setSteering(String steering) {
		this.steering = steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public void setAirConditioner(String airConditioner) {
		this.airConditioner = airConditioner;
	}
	public String getFridge() {
		return fridge;
	}
	public void setFridge(String fridge) {
		this.fridge = fridge;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	public void setEntertainmentSystem(String entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}

	
}
