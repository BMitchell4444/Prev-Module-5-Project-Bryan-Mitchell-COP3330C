import java.io.*;
import java.util.*;
public class Collectlist {

	public static void main(String[] args) {
		int i = 0;
		String name;
		String search;
		
		List<String> nameList = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 8; i++) {
		System.out.print("Enter name " + (i + 1) + ": ");
		name = scan.next();
		
		nameList.add(name);
		}
		
		for(String n : nameList) {
			System.out.println(n);
		}
		
		Collections.sort(nameList);
		System.out.print("\n\n");
		
		for(String n : nameList) {
			System.out.println(n);
		}
		
		Collections.shuffle(nameList);
		System.out.print("\n\n");
		
		for(String n : nameList) {
			System.out.println(n);
		}
		
		System.out.print("\nEnter a name to search for: ");
		search = scan.next();
		
		System.out.print("\nName at index: " + nameList.indexOf(search));
		
		String[] nameArr = nameList.toArray(new String[0]);
		
		System.out.print("\nArray output: ");
		for(i = 0; i < 8; i++) {
			System.out.println(nameArr[i]);
		}
		
		List<String> arrToList = Arrays.asList(nameArr);
		
		System.out.print("\nList Output: ");
		for(String n : arrToList) {
			System.out.println(n);
		}
		
		/*The difference between Collections and Collection is that Collections contains a variety
		 * of methods to manipulate Collection. Collection contains a variety of abstract methods that can be used by its sub-interfaces such as set and list.
		 * Collection also represents a variety of similar objects.
		 * Since Collection is a interface it cannot be instantiated and it doesn't define its methods.
		 * Interfaces are basically blueprints of classes because classes are supposed to implement the methods and variables used by the interface.
		 * A store can be used to explain the difference between a interface and class.
		 * Interfaces can represent more general categories such as Items and Electronics.
		 * Classes can represent specific categories such as TV or Dishwasher.
		 * Every item in the store will have a name, price, item number, and quantity.
		 * Every electronic will have a power source.
		 * While you can get more specific than TV it would be extra work to make a class for different types of TV so a TV would be better as a class,
		 * the same argument goes with dishwashers.
		 * Every TV is a Electronic and every Electronic is a Item, so every TV will have the variables and methods of Electronic and Item.
		 * 
		 * Sources:geeksforgeeks, tutorialspoint
		 * https://www.geeksforgeeks.org/collection-vs-collections-in-java-with-example/
		 * https://www.geeksforgeeks.org/differences-between-interface-and-class-in-java/
		 * https://www.geeksforgeeks.org/interfaces-in-java/
		 * https://www.tutorialspoint.com/differences-between-interface-and-class-in-java#:~:text=Differences%20between%20Interface%20and%20class%20in%20Java%201,3%20Example%20of%20Class%20vs%20Interface%20JavaTester.java%20
		 * */
	}

}
