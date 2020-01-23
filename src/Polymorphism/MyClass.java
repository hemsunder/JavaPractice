package Polymorphism;

public class MyClass {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalsound();
		
		Pig pig = new Pig();
		pig.animalsound();
		pig.animalsize();
		
		Animal pigg = new Pig();
		pigg.animalsize();
		pigg.animalsound();

	}

}
