package ch07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.breathe();
		cat.sound();
		dog.breathe();
		dog.sound();
		
		animalSound(cat);
		animalSound(dog);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
	}

}
