public class Outer {
	private static int testVar = 10;
	public static void testOuterMethod() {
		System.out.println("From outer method");
	    System.out.println("value of inner class variavle :"+Inner.x);
	}
	
	
	public static class Inner{
		public static int x = 5;
		public static void testingInnerMethod() {
		System.out.println("Testing inner class method..");	
		System.out.println("Test variable value :"+ testVar);
		testOuterMethod();
		}
	}

}
