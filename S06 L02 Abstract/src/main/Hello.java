package main;
import data.*;
public class Hello {

	public static void main(String[] args) {

		Person tanmay = new Vegan();
		tanmay.speak();
		tanmay.eat();
		 
		Person pratham = new NonVegan();
		pratham.speak();
		pratham.eat();
	
		System.out.println(pratham.equals(tanmay));
		
	}

}
