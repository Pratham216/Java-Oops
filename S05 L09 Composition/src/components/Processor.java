package components;

public class Processor {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;

	public Processor() {
		super();
		this.brand = "intel";
		this.series = "i7 7400u";
		this.generation = 7;
		this.cores = 5;
		this.threads = 4;
		this.cacheMemory = "10 Mb";
		this.frequency = "2.5Ghz";
		this.minFrequency = "2.5Ghz";
		this.maxFrequency = "3.1Ghz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		super();
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFrequency() {
		return minFrequency;
	}

	public String getMaxFrequency() {
		return maxFrequency;
	}

	public void setFrequency(String frequency) {  //FUNCTIONALITY..
		this.frequency = frequency;               // we had to put the frequency that is why we set the frequency
	}

}
