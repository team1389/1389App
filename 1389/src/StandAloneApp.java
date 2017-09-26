import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StandAloneApp extends JFrame implements ActionListener 
{ 

	JLabel label = new JLabel("TELEOPERATED PERIOD");
	JLabel label1 = new JLabel("AUTONOMOUS PERIOD");
	JTextField match = new JTextField("Match");
	JTextField team = new JTextField("Team");
	JTextField autoBall = new JTextField("AutoBalls!");
	JTextField autoGear = new JTextField("Auto Gear?");
	JTextField teleBalls = new JTextField("TeleBalls");
	JTextField teleGears = new JTextField("TeleGears");
	JTextField climb = new JTextField("Climbing Y/N");
	JTextField errors = new JTextField("Errors?");
	JButton submit = new JButton("New Frame");

	JLabel newFrame1 = new JLabel();
	JLabel newFrame2 = new JLabel();
	JLabel newFrame3 = new JLabel();
	JLabel newFrame4 = new JLabel();
	JLabel newFrame5 = new JLabel();
	JLabel newFrame6 = new JLabel();
	JLabel newFrame7 = new JLabel();
	JLabel newFrame8 = new JLabel();


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		StandAloneApp frame = new StandAloneApp();
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);
	}
	public StandAloneApp()
	{
		Box box = Box.createVerticalBox();
		add( box );


		label1.setAlignmentX(CENTER_ALIGNMENT);
		box.add(label1);



		this.match.setAlignmentX(CENTER_ALIGNMENT);
		box.add(match);



		this.team.setAlignmentX(JTextField.CENTER_ALIGNMENT);
		box.add(team);


		this.autoBall.setAlignmentX(CENTER_ALIGNMENT);
		box.add(autoBall);


		this.autoGear.setAlignmentX(CENTER_ALIGNMENT);
		box.add(autoGear);

		this.label.setAlignmentX(CENTER_ALIGNMENT);
		box.add(label);


		this.teleBalls.setAlignmentX(CENTER_ALIGNMENT);
		box.add(teleBalls);


		this.teleGears.setAlignmentX(CENTER_ALIGNMENT);
		box.add(teleGears);


		this.climb.setAlignmentX(CENTER_ALIGNMENT);
		box.add(climb);


		this.errors.setAlignmentX(CENTER_ALIGNMENT);
		box.add(errors);


		this.submit.addActionListener(this);
		this.submit.setVisible(true); 

		box.add(submit);







		// on the click of the button, all values stored in the JFrame are supposed to log to the console
		//if all goes well, we can copy them over, or make a program that will copy them over


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JFrame frame1 = new JFrame("Data");
		frame1.setSize(500, 500);
		frame1.setVisible(true);

		Box box2 = Box.createVerticalBox();
		frame1.add( box2 );

		String match1 = match.getText();
		newFrame1.setText(match1);
		newFrame1.setAlignmentX(CENTER_ALIGNMENT);
		newFrame1.setVisible(true);
		box2.add(newFrame1);

		String team1 = team.getText();
		newFrame2.setText(team1);
		newFrame2.setAlignmentX(CENTER_ALIGNMENT);
		newFrame2.setVisible(true);
		box2.add(newFrame2);

		String autoBall1 = autoBall.getText();
		newFrame3.setText(autoBall1);
		newFrame3.setAlignmentX(CENTER_ALIGNMENT);
		newFrame3.setVisible(true);
		box2.add(newFrame3);

		String autoGear1 = autoGear.getText();
		newFrame4.setText(autoGear1);
		newFrame4.setAlignmentX(CENTER_ALIGNMENT);
		newFrame4.setVisible(true);
		box2.add(newFrame3);

		String teleBalls1 = teleBalls.getText();
		newFrame5.setText(teleBalls1);
		newFrame5.setAlignmentX(CENTER_ALIGNMENT);
		newFrame5.setVisible(true);
		box2.add(newFrame5);

		String teleGears1 = teleGears.getText();
		newFrame6.setText(teleGears1);
		newFrame6.setAlignmentX(CENTER_ALIGNMENT);
		newFrame6.setVisible(true);
		box2.add(newFrame6);


		String climb1 = climb.getText();
		newFrame7.setText(climb1);
		newFrame7.setAlignmentX(CENTER_ALIGNMENT);
		newFrame7.setVisible(true);
		box2.add(newFrame7);

		String errors1 = errors.getText();
		newFrame8.setText(errors1);
		newFrame8.setAlignmentX(CENTER_ALIGNMENT);
		newFrame8.setVisible(true);
		box2.add(newFrame8);



	}
}