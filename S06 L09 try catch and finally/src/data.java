
public class data {

	public static void main(String[] args) {
		int x = 5;
		
		try {
			System.out.println(x / 2);
			System.out.println(x / 0);

		} catch (ArithmeticException i) {
			System.out.println("nigga wtf??");
		} catch (RuntimeException e) {

			System.out.println("Runtime exception !!");

		} catch (Exception u) {
			System.out.println("Exception !!");
		} finally {
			System.out.println("this will always get executed ");
		}
	}

}
