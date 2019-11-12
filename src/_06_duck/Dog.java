package _06_duck;

public class Dog {
	private String name;
	private int age;
	
	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void bark() {
		System.out.println("WOOF!");
	}
	
	public void eat() {
		System.out.println(name + " eats a treat.");
	}
}
