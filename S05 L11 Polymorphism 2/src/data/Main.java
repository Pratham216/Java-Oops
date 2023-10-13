package data;
import object.*;
public class Main {

	public static void main(String[] args) {
		Phone phone = new Main().tele(1);
		System.out.println(phone.getModel());
		phone.features();
		
		Phone samsung = new Main().tele(2);
		System.out.println(samsung.getModel());
		samsung.features();
		
		Phone apple = new Main().tele(3);
		System.out.println(apple.getModel());
		apple.features();

	}
	public Phone tele(int method ) {
		switch(method) {
		case 1 :  return new Phone("Redmi Note 11 Pro Max plus 5G");
		case 2 :  return new Samsung("Samsung S22 Ultra Pro");
		case 3 :  return new Apple("Apple iphone 14 pro max");
		}
		return null;
	}

}
