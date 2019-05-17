//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int randomChoice = rand.nextInt(5);
		
		System.out.println(randomChoice);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			int randomChoice = rand.nextInt(5);
		if (randomChoice == 0) {
		
		} else if (randomChoice == 1) {
			JOptionPane.showMessageDialog(null, "You are O");
		} else if (randomChoice == 2) {
			JOptionPane.showMessageDialog(null, "You are Z");
		} else if (randomChoice == 3) {
			JOptionPane.showMessageDialog(null, "You are A");
		} else if (randomChoice == 4) {
			JOptionPane.showMessageDialog(null, "You are N");
		} else {
		
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}
