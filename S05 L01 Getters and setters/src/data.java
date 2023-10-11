public class data{
	public static void main(String[] args) {
		Car cars= new Car();
		cars.setDoors("closed");
		cars.setEngine("On");
		cars.setDriver("Seated");
		cars.setSpeed(120);
		
		System.out.println("The doors are : "+cars.getDoors()+"\nThe engine is :"+ cars.getEngine()
		
				+"\nThe driver is : "+ cars.getDriver()+"\nThe speed of the vehicle is : "+cars.getSpeed());
	}
}