import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OtherWayOfDoingIt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JOptionPane pane = new JOptionPane();
		
		
		JFrame frame = new JFrame("Main");
		frame.setSize(500, 780);
		frame.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setSize(500, 780);
		panel.setVisible(true);
		

		JLabel label = new JLabel();
		label.setLocation(0, 2);
		label.setText("hello");
		label.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setLocation(0, 2);
		label1.setText("hello");
		label1.setVisible(true);
		
		JLabel label2 = new JLabel();
		label2.setLocation(0, 2);
		label2.setText("hello");
		label2.setVisible(true);
		
		JLabel label3 = new JLabel();
		label3.setText("hello");
		label3.setLocation(0, 2);
		label3.setVisible(true);
		
		JLabel label4 = new JLabel();
		label4.setText("hello");
		label4.setVisible(true);
		
		JLabel label5 = new JLabel();
		label5.setText("hello");
		label5.setVisible(true);
		
		JLabel label6 = new JLabel();
		label6.setText("hello");
		label6.setVisible(true);
		
		JLabel label7 = new JLabel();
		label7.setText("hello");
		label7.setVisible(true);
		
		JLabel label8 = new JLabel();
		label8.setText("hello");
		label8.setVisible(true);
		
		panel.add(label);
		label.setVisible(true);
		panel.add(label1);
		label1.setVisible(true);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(label7);
		panel.add(label8);
		
		frame.add(panel); 
		panel.setVisible(true);
		frame.setVisible(true);
		
		String match = JOptionPane.showInputDialog("Match?");
		label.setText(match);
		String team = JOptionPane.showInputDialog("Team Being Scouted");
		label1.setText(team);
		String autoBalls = JOptionPane.showInputDialog("How Many Autonomous Balls?");
		label2.setText(autoBalls);
		String autoGear = JOptionPane.showInputDialog("Autonomous Gear? Yes or No");
		label3.setText(autoGear);
		
		
		
		label.setText(match);
		
		
		
		
	}

}
