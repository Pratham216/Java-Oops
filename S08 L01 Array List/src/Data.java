import java.util.ArrayList;
	
public class Data {
	
	static ArrayList<String> Avengers = new ArrayList<>();
	
	public static void main(String[] args) {
		Avengers.add("Iron man");
		Avengers.add("Captain America");
		Avengers.add("Thor");
		Avengers.add("Hulk");
		Avengers.add("Black Widow");
		Avengers.add("Hawkeye");
		
		Display(Avengers);
		System.out.println("***********");
		
		RemoveNameByIndex(5);
		Display(Avengers);
		System.out.println("***********");
		
		RemoveNameByString("Black Widow");
		Display(Avengers);
		System.out.println("***********");
		
		ModifyName(2,"Pratham");
		Display(Avengers);
		System.out.println("***********");
		
		System.out.println(SearchName("Pratham"));
		
		
	}
	static void Display(ArrayList<String> avengers) {
		for(String marvel :Avengers) {
			System.out.println(marvel);
		}
		
	}
	static void RemoveNameByIndex(int position) {
		Avengers.remove(position);
	}
	static void RemoveNameByString(String Name) {
		Avengers.remove(Name);
	}
	static void ModifyName(int position,String NewName) {
		Avengers.set(position, NewName);
	}
	static int SearchName(String name) {
		return Avengers.indexOf(name);
	}
}  