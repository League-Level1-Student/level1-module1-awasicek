package _06_duck;

public class DuckDriver {
	public static void main(String[] args) {
		Duck myDuck = new Duck("bread", 3);
		myDuck.waddle();
		myDuck.quack();
		
		Dog myDog = new Dog("Chai", 7);
		myDog.bark();
		myDog.eat();
	}
}
