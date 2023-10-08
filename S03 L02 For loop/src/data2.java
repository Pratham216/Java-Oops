
import java.util.*;
public class data2{
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a= sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b= sc.nextInt();
		
		System.out.println("Enter the value of c : ");
		int c= sc.nextInt();
		
		float det = b*b - 4*a*c;
		float x = (float) ((-b +Math.sqrt(det))/2*a);
		sc.close();
		
		System.out.println(x);
	}
}