package object;

import components.GraphicsCard;
import components.Processor;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard; 
	private String opticalDrive;
	private String keyboard;

	public Laptop() {
		super();
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR5";
		this.hardDrive = "6Tb";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "MLT layer";
		this.keyboard = "Backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;// now to access its property we will generate getters as it is object inside a
									// object
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;// creating getters for object graphicCard inside object laptop
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	
	
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public Processor getProcessor() {
		return processor;
	}
	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency()); // FUNCTIONALITY
		graphicsCard.setSeries(500);// overwritten the given value
		return "Success";
	}
}
