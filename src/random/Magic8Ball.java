package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below¦.
		public static void main(String[] args) {
			
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
			Random Random = new Random();
			int randNumber = Random.nextInt(4);
	// 3. Print out this variable
			System.out.println(Random);
	// 4. Get the user to enter a question for the 8 ball
			String question = JOptionPane.showInputDialog("ENTER A QUESTION BELOW.");
	// 5. If the random number is 0
			if (randNumber == 0) {
				JOptionPane.showMessageDialog(null, "YES");
			}
	// -- tell the user "Yes"

	// 6. If the random number is 1
			else if (randNumber == 1) {
				JOptionPane.showMessageDialog(null, "NO");
			}
	// -- tell the user "No"

	// 7. If the random number is 2
			else if (randNumber == 2) {
				JOptionPane.showMessageDialog(null, "MAYBE YOU SHOULD ASK GOOGLE");
			}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
			else if (randNumber == 3) {
				JOptionPane.showMessageDialog(null, "ASK YOURSELF, IM NOT YOUR SERVANT!");
			}
	// -- write your own answer
		}
}
