package Inheritance;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("animal");
		Cat kedi = new Cat("cat");

		animal.makeSound();
		kedi.makeSound();
	}
}
