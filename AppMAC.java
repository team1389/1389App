import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author evanb
 *
 */
public class AppMAC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("1389App");
		frame.setSize(300, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 320);
		panel.setLayout(null);
		panel.setVisible(true);
		
		frame.add(panel); //adds the panel to the frame
		
		JLabel label = new JLabel(); //defines the new label
		label.setSize(300, 320);
		label.setLocation(0,0);
		label.setLayout(null); //makes the layout settable by the user
		panel.add(label); //adds the label to the panel
		
		JButton button1 = new JButton("MATCH");
		button1.setLocation(45, 50);
		button1.setSize(100, 30);
		button1.setVisible(true);
		panel.add(button1);
		
		JButton button2 = new JButton("PIT TEAM INFO");
		button2.setLocation(45, 100);
		button2.setSize(150, 30);
		button2.setVisible(true);
		panel.add(button2);
		
		JButton button3 = new JButton("SCOUTS");
		button3.setLocation(45, 150);
		button3.setSize(100, 30);
		button3.setVisible(true);
		panel.add(button3);
		
		JButton button4 = new JButton("DRIVE");
		button4.setLocation(45, 200);
		button4.setSize(100, 30);
		button4.setVisible(true);
		panel.add(button4);
	}


private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

}
	}
