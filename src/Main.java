import java.util.ArrayList;

public class Main {
	
	public static void printAnimals(ArrayList<Animal> aList) {
		for (Animal a : aList) {
			a.makeSound();
			a.introduceYourself();
			a.move();
			System.out.println("");
		}	
	}
	
	public static void printReptile(ArrayList<Reptile> aList) {
		for (Reptile r : aList) {
			r.makeSound();
			r.introduceYourself();
			r.move();
			r.bask();
			System.out.println("");
		}	
	}

	public static void main(String[] args) {
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(new Crocodile("Croc"));
		animalList.add(new Snake("Snek"));
		animalList.add(new Horse("Horse"));
		
		ArrayList<Reptile> reptileList = new ArrayList<Reptile>();
		reptileList.add(new Crocodile("Croc2"));
		reptileList.add(new Snake("Snek2"));
		
		
		// printAnimals(animalList);
		// printReptile(reptileList);
		
		Human guy1 = new Human("Bob", new Horse("Zeno"));
		guy1.introducePet();
		
		Human guy2 = new Human("Carly", new Snake("Slither"));
		guy2.introducePet();
	}
}
