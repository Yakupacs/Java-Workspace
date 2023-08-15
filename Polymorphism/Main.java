package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("animal");
		Cat kedi = new Cat("cat");
		Dog dog = new Dog("dog");

		animal.makeSound();
		kedi.makeSound();
		dog.makeSound();
	}
}
