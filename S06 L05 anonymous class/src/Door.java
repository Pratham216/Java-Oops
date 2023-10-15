abstract class Lock{
	public abstract boolean isUnlocked(String Keycode);
	public  void test() {
		System.out.println("test sucessfull");
	}
}


public class Door{
	Lock lock = new Lock() {

		@Override
		public boolean isUnlocked(String Keycode) {
			if(Keycode.equals("openup")) {
			return true;
		}else {
			return false;
		}
		}
	};

	public Lock getLock() {
		return lock;
	}
	
}