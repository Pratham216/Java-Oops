package children;
import parent.Vehicle;

public class Truck extends Vehicle{
	public String steering;
	public String musicSystem;
	public String airConditioner;
	public int Container;
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
	public int getContainer() {
		return Container;
	}
	public void setContainer(int container) {
		Container = container;
	}
	
	
}
