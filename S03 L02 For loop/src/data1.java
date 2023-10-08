import java.util.*;
public class data1 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number : ");
			double num = sc.nextInt();
			sc.close();
			double fact = 1;
			for (double i =1; i<=num;i++) {
				fact=fact*i;
				
			}System.out.println("The factorial of the given number is :"+fact);
		}
	}
