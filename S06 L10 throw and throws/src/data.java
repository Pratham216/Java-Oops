import java.io.FileNotFoundException;

public class data {

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			System.out.println("Catch block main method..");

		} catch (Exception u) {
			System.out.println("Catch block sub main method...");
		}
	}

	public static void method() throws Exception {
		System.out.println("A message from the inner method...");
		throw new FileNotFoundException();
	}
}
