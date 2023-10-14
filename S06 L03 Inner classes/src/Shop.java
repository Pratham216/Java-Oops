
public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.ShopStatus();
		door.getLock().setLock(false);
		door.ShopStatus();
		
	}

}
