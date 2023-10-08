
public class data{
	public static void main (String[] args) {
		int num= 11;
		int count = 0;
		for(int i = 2;i<num; i++) {
			if (num%i==0) {
				count ++;
				break;
			}
			
	   }if(count==1) {
		   System.out.println("not prime");
	   }else {
		   System.out.println(" prime");
	   }
	}
}