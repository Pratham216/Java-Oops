public class data{
	public static void main(String[] args) {
		Car car= new Car();
		car.setDoors("closed");
		car.setEngine("on");
		car.setDriver("seated");
		car.setSpeed(60);
		 System.out.println(car.run());
	}
}//if we do not give the value of doors engine
//and driver speed then it will generate an error
//so to remove that error we will see the next lecture