import java.time.DayOfWeek;

public class Hello {

	public static void main(String[] args) {
		
		
		DayOfWeek today = DayOfWeek.SATURDAY;
		if(today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY ) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("It is a week day");
		}
	}
}
