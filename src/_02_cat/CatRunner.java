package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
        // 1. Make the Cat meow
		Cat myCat = new Cat("Hobbes");
		myCat.meow();
		
		// 2. Get the Cat to print it's name
		myCat.printName();

		// 3. Kill the Cat! 
		for(int i = 0; i < 9; i++) {
			myCat.kill();
		}
		
	}
}
