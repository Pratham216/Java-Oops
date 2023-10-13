package data;
import object.Apple;
import object.Phone;
import object.Samsung;
public class Main {

	public static void main(String[] args) {
		Phone phone = new Phone("Apple iphone 14 pro max");
		System.out.println(phone.getModel());
		phone.features();
		
		Phone samsung = new Samsung("Samsung S22 Ultra Pro");  // polymorphism as samsung is a phone then it can be written as this
		System.out.println(samsung.getModel());
		samsung.features();
	
		Apple apple = new Apple("Apple iphone 14 pro max");
		System.out.println(apple.getModel());        // there is no features in apple class but it is showing features from the phone class
		apple.features();
	}

}
