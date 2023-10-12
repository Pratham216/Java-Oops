package main;
import children.Car;
import children.bike;
import children.Truck;

public class Demo {
	public static void main (String[] args) {
		bike pulsar = new bike();
		Car lambo= new Car();
		Truck truck = new Truck();
		
		pulsar.setHandle("Short Handle");	
		pulsar.setFuelTank("Double Fuel Tank");
		lambo.setAirConditioner("AUTOMATIC AC");
		truck.setContainer(5);
		System.out.println(pulsar.getHandle()+"\n"+ pulsar.getFuelTank());
		System.out.println(lambo.getAirConditioner());
		System.out.println(truck.getContainer());
	}

}
