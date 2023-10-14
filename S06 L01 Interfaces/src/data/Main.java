package data;
import phone.*;
public class Main {

	public static  void main(String[] args) {
		Phone phone = new OnePlus5();
		System.out.println("Features of One Plus 5 are as follows :\n");
		System.out.println("Processor of One plus 5 is  : "
		+phone.processor()+"\nOs of One plus 5 is :"
		+phone.oS()+"\nSpace in One Plus 5 is :"
		+phone.spaceInGb());
		
		System.out.println("--------------------------------");
		System.out.println("Features of Apple Iphone 8 are as follows :\n");
		Phone apple = new Iphone8();
		System.out.println("Processor of Apple Iphone 8 :"+ apple.processor()
		+"\nOs of apple is : "+apple.oS()
		+"\nSpace in apple is :"+ apple.spaceInGb());
		

	}

}
