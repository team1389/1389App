import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author 184163
 * @override
 */
public class MainAppClass {

	/**
	 * @param args
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("GUI");
		frame.setSize(320, 350);
		frame.setBackground(Color.WHITE);
		frame.setVisible(true);
		frame.setResizable(false);


		JPanel panel = new JPanel();
		panel.setSize(50,50);

		JLabel label = new JLabel();
		frame.add(panel);
		panel.add(label);

		label.setText("Welcome to Team 1389!");

		JButton button = new JButton("MATCHES");
		button.setSize(100, 30);
		button.setLocation(95, 45);
		button.setVisible(true);

		frame.add(button);

		JButton button2 = new JButton("PIT TEAM");
		button2.setSize(100, 30);
		button2.setLocation(95, 100);
		button2.setVisible(true);
		frame.add(button2);


		JButton button3 = new JButton("SCOUTING");
		button3.setSize(100, 30);
		button3.setLocation(95, 150);
		button3.setVisible(true);
		frame.add(button3);
		
		JButton button4 = new JButton("OTHER INFORMATION");
		button4.setSize(100, 30);
		button4.setLocation(50, 200);
		button4.setVisible(true);
		frame.add(button4);


	}


}

