public class Door{
	private Lock lock;
	public Door() {
		lock = new Lock(true);
	}
	public Lock getLock() {
		return lock;
	}
	
	public void ShopStatus(){
		if(lock.isLock()) {
			System.out.println("Sorry the shop is closed.. please visit us again");
			
		}else {
			System.out.println("Welcome to our shop.. :)");
		}
	}
	
	public class Lock{
		private boolean lock;

		public Lock(boolean lock) {
			this.lock= lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}
}