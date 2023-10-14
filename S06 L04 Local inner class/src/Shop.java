
public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		if(door.isLocked(args[0])) {
			System.out.println("welcome to our shop  :)");
		}else {
			System.out.println("The shop is closed..please visit us again");
		}
	}

}
