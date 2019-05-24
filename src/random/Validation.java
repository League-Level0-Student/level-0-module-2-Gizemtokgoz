package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 5; i++) {
			int randNumber = rand.nextInt(5); 
		if (randNumber == 0) {
		
		} else if (randNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are weird!");
		} else if (randNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are stupid!");
		} else if (randNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are interesting!");
		} else if (randNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are dumb!");
		} else {
		
		}
		// 2. Repeat all the code above 10 times
			
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}

