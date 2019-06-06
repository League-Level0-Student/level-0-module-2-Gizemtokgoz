import javax.swing.JOptionPane;

public class RollerCoaster {

	public static void main(String[] args) {
		
		String question= JOptionPane.showInputDialog("How tall are you (In inches) ?");
		int height = Integer.parseInt(question);		
		
		if ( height >= 48) {JOptionPane.showMessageDialog(null, "You are tall enough to ride The Coaster! :)");
		}
		else if ( height < 24) {JOptionPane.showMessageDialog(null, "You are a baby, go away!");
		}
		else {JOptionPane.showMessageDialog(null, "You are not tall enough to ride on The Coaster :(. Go home and grow some more!");
		}
}
}
