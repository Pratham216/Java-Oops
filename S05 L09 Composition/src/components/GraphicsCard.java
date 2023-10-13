package components;

public class GraphicsCard {
	private String brand;
	private int series;
	private String memory;

	public GraphicsCard() {

		this.brand = "Nvidia";
		this.series = 950;
		this.memory = "2 Gb";
	}

	public GraphicsCard(String brand, int series, String memory) {

		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	public String toString() {
		return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

	public String getBrand() {
		return brand;
	}

	public int getSeries() {
		return series;
	}

	public String getMemory() {
		return memory;
	}

	public void setSeries(int series) {  
		this.series = series;           // have to use in the main method 
	}

	

}
