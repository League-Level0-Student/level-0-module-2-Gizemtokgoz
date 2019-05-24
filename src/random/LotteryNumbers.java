package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		String wrong = "";
		char right = '4';
		for (int i = 0; i < 5; i++) { 
		
		int randNumber = rand.nextInt(5)+1; 
		wrong = wrong + randNumber + " ";
		}
		JOptionPane.showMessageDialog(null, "" + wrong);
		for (int i = 0; i < wrong.length(); i++) { 
		if (wrong.charAt(i) == right) {
			JOptionPane.showMessageDialog(null,"You Won!");
		}
		}
	}

}
