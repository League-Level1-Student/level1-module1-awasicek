package _06_duck;

public class Duck {
	private String favoriteFood;
	private int numberOfFriends;
	
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	
	public void quack() {
		System.out.println("QUACK!");
	}
	
	public void waddle() {
		System.out.println("The duck waddles around aimlessly.");
	}
}
