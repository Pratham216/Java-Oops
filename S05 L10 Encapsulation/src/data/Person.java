package data;

public class Person {
	public String name ;
	public int age;
	public String gender ;
	

	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if(age>=0 && age<=100) {
			this.age = age;
			return true;
		}
		return false;	
	}

	public String getGender() {
		return gender;
	}
	
	
}
