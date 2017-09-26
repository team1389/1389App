import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App extends JFrame implements ActionListener 
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
	JButton submit = new JButton("Submit");
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args)
{
	App frame = new App();
	frame.setSize(500, 500);
	frame.setResizable(false);
	frame.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
	frame.setLocationRelativeTo( null );
	frame.setVisible(true);
}
public App()
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
	
	String match1 = match.getText();
	System.out.println(match1);
	
	String team1 = team.getText();
	System.out.println(team1);
	
	String autoBall1 = autoBall.getText();
	System.out.println(autoBall1);
	
	String autoGear1 = autoGear.getText();
	System.out.println(autoGear1);
	
	String teleBalls1 = teleBalls.getText();
	System.out.println(teleBalls1);
	
	String teleGears1 = teleGears.getText();
	System.out.println(teleGears1);
	
	String climb1 = climb.getText();
	System.out.println(climb1);
	
	String errors1 = errors.getText();
	System.out.println(errors1);
	
	
}
}