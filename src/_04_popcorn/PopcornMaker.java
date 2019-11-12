package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// The main method should create a bag of Popcorn and cook it in the microwave.
		// Ask the user for the flavor of the popcorn and the number of minutes to cook it.
		
		Microwave microWave = new Microwave();
		String popcornFlavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		int numMinutes = Integer.parseInt(JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn for?"));
		Popcorn popcorn = new Popcorn(popcornFlavor);
		
		microWave.putInMicrowave(popcorn);
		microWave.setTime(numMinutes);
		microWave.startMicrowave();

	}

}
