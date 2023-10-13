package main;
import object.Laptop;
import components.*;
public class Demo {
	public static void main(String[] args) {
	Laptop laptop = new Laptop();
	System.out.println(laptop);
	System.out.println(laptop.getGraphicsCard().getSeries());
	System.out.println(laptop.getProcessor().getGeneration());
	
	
	
	Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6MB"
			+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
	GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
	
	Laptop gamingLaptop = new Laptop(17f, processor,
			"DDR4", "2TB", graphicsCard, null, "backlit");
	System.out.println("---------------------------");
	System.out.println(gamingLaptop);
	gamingLaptop.gamingMode();            // Functionality
	System.out.println("Gaming mode on");
	System.out.println("Current frequency: "+gamingLaptop.getProcessor().getFrequency());
	System.out.println(gamingLaptop.getGraphicsCard().getSeries());
	
	
	
	}
}