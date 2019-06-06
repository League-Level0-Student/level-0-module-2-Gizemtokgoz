import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String question= JOptionPane.showInputDialog("Are you eligible to vote? Enter how old you are below?");
		int age = Integer.parseInt(question);		
		if ( age >= 18) {JOptionPane.showInputDialog("Who do you want to be the next President?");
		}
		else if ( age < 18) {JOptionPane.showMessageDialog(null, "HAHA, you arent old enough! No one cares what you think! GO AWAY!");
		}
}
}
