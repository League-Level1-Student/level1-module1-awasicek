package _05_vault;

import java.util.Random;

public class Vault {
	// We need a Vault object that contains a secret code.
	private int secretCode;
	
	Vault(int secretCode) {
		this.secretCode = secretCode; 
	}
	
	// It also contains a tryCode() method that takes a number as a parameter and returns true if that number opens the vault, false otherwise.
	public boolean tryCode(int enteredCode) {
		boolean isCracked = enteredCode == secretCode;
		if(isCracked) System.out.println("Cracked the safe with code: " + enteredCode);
		return isCracked;
	}
}
