package _03_harry_potter;

public class HarryRunner {
	public static void main(String[] args) {
		// 1. create harry potter
		HarryPotter myPotter = new HarryPotter();
		
		// 2. make him become invisible
		myPotter.makeInvisible(true);
		
		// 3. spy on Professor Snape
		myPotter.spyOnSnape();
		
		// 4. make him become visible again
		myPotter.makeInvisible(false);
		
		// 5. cast a “stupefy” spell
		myPotter.castSpell("stupefy");
		
	}
}
