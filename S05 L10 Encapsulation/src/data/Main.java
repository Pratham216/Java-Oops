package data;
public class Main {
	public static void main(String[]args) {
	Person pratham = new Person("Pratham", 19, "Male");
	System.out.println(pratham);
	pratham.setAge(0);
	System.out.println(pratham);
	pratham.setAge(100);
	System.out.println(pratham);
	pratham.setAge(101);
	System.out.println(pratham);
	
	}
}
