
public class Hello {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0]= 12;
		arr[1]= 33;
		arr[2]= 44;
		arr[3]= 55;
		arr[4]= 66;
		
		for(int numbers : arr) {
			System.out.print(numbers+" ");
		}
		
		System.out.println("\n");
		
		int[] array2 = {1,2,3,4,5,6,7,8,9};
		for (int SecNum : array2) {
		    System.out.print(SecNum+" ");
		}
	}

}
