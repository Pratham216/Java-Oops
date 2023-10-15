
public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.getLock().test();
		System.out.println(door.getLock().isUnlocked("openup"));
		if(door.getLock().isUnlocked(args[0])) {
			System.out.println("Welcome to our shop");
			
		}else {
			System.out.println("Sorry the shop is closed");
		}
		
		
	}

}
