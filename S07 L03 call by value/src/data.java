
public class data {
	public static void main(String[] args) {
		
		int value = 25;
		System.out.println("Current value of variable is display"
				+"method is "+ value);
		display(value);
		System.out.println("Current value of variable is display"
				+"method is "+ value);
		/*this will print 25 again because in call by value the 
		 * memory location is allocated to the local of the method 
		 * or function and as soon as the function or method is finished
		 * the local variable will not be used in the function 
		 * thats why it will give the value 25 again as it is the global value..
		 */
		
	}
	static void display(int value) {
		System.out.println("Current value of variable is display"
				+"method is "+ value);
		 value = 50;
		 System.out.println("Current value of variable is display"
					+"method is "+ value);
		
	}
}
