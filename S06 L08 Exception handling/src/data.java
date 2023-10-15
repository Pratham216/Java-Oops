
public class data {

	public static void main(String[] args) {

		data test = new data();
		test.case1(10, 5);
		test.case1(10, 0);
		test.case2(10, 2);
		test.case2(123230, 0);
		
	}

	public void case1(int x, int y) {
		if(y!=0) {
		System.out.println(x/y);
		}else {
			System.out.println("Cannot divide as the value of y is 0");
		}
	}
	
	public void case2(int x , int y) {
		try{
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println("Cannot divide as the value of y is 0");
		}
	}
}
