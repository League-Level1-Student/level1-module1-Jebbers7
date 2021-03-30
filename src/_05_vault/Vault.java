package _05_vault;

import java.util.Random;

public class Vault {
int secretCode;
	Vault(){
	Random ran = new Random();
	secretCode = ran.nextInt(1000000);
	
}
	boolean tryCode(int guess) {
		return guess == secretCode;
	}
}
