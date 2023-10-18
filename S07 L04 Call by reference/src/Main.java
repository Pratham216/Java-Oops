
public class Main {
	public static void main(String[] args) {
		String[] names = {"Iron man","Captain","Thor","Hulk","Black widow","Hawkeye"};
		display(names);
	
	}
	static void display(String[] names) {
		
		names[4]= "Dr. Strange";
		for(String avengers: names) {
			System.out.println(avengers);
		}
	}
}
