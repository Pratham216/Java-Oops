
public class Door {
	public boolean isLocked(String key) {
		class Lock {
			public boolean isLocked(String key) {
				if (key.equals("Khuljasimsim")) {
					return true;
				} else {
					return false;
				}
			}
		}
		return new Lock().isLocked(key);  // new lock() is called as anonymous object 
	}
}
