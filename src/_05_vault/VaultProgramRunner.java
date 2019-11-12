package _05_vault;

public class VaultProgramRunner {
	public static void main(String[] args) {
		JamesBond bond = new JamesBond();
		System.out.println(bond.tryCode(new Vault(1007)));
	}
}
