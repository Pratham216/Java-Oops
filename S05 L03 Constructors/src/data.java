public class data{
	public static void main(String[] args) {
		Car lambo= new Car();// it will take the default value given by us
		Car ferrari= new Car("closed","on","seated",500);//it wil take the value which we had given 
		 System.out.println(lambo.run());
		 System.out.println(ferrari.run());
	}
}