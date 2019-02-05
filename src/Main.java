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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Crocodile croc = new Crocodile("Croc");
//		Snake snak = new Snake("Snek");
//		Horse hors = new Horse("Horse");
//		
//		croc.makeSound();
//		croc.introduceYourself();
//		croc.move();
//		System.out.println("");
//		
//		snak.makeSound();
//		snak.introduceYourself();
//		snak.move();
//		System.out.println("");
//		
//		hors.introduceYourself();
//		hors.makeSound();
//		hors.move();
		
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(new Crocodile("Croc"));
		animalList.add(new Snake("Snek"));
		animalList.add(new Horse("Horse"));
		
		printAnimals(animalList);
	}
}
