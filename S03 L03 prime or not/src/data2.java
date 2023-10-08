import java.util.*;
public class data2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		int count =0;
		for(int i = 2; i<=num/2; i++) {
			if (num%i==0) {
			count++;
			System.out.println("not prime");
			
			break;
		}
	}if (count==0) {
		System.out.println("Prime");
	}
		

	}

}
