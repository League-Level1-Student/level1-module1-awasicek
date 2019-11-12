package _05_vault;

public class JamesBond {
	// Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
	// The codes are between 0 and 1 million. 
	// This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.
	public int tryCode(Vault vault) {
		int correctCode = -1;
		for(int i = 0; i < 1000000; i++) {
			System.out.println("Trying code: " + i);
			if(vault.tryCode(i)) {
				correctCode = i;
				break;
			}
		}
		return correctCode;
	}
}
