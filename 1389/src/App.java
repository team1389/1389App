import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App extends JFrame implements ActionListener 
{ 

	JLabel label = new JLabel("TELEOPERATED PERIOD"); //variable declaration
	JLabel label1 = new JLabel("AUTONOMOUS PERIOD");
	JTextField match = new JTextField("Match");
	JTextField team = new JTextField("Team");
	JTextField autoBall = new JTextField("AutoBalls!");
	JTextField autoGear = new JTextField("Auto Gear?");
	JTextField teleBalls = new JTextField("TeleBalls");
	JTextField teleGears = new JTextField("TeleGears");
	JTextField climb = new JTextField("Climbing Y/N");
	JTextField errors = new JTextField("Errors?");
	JButton submit = new JButton("Submit"); // end variable declaration


	String newFrame1;
	String newFrame2;
	String newFrame3;		// the variables that print to the Jtables, use .getText()
	String newFrame4;
	String newFrame5;
	String newFrame6;
	String newFrame7;
	String newFrame8;

	JFrame frame1 = new JFrame("Data Received"); // the new frame that the button invokes
	



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // eclipse complained when this wasnt here

	public static void main(String[] args)
	{
		App frame = new App();
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation( DISPOSE_ON_CLOSE ); // making default table with all of the elements
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);
	}
	public App()
	{
		Box box = Box.createVerticalBox();
		add( box ); // made box layout on the JFrame


		label1.setAlignmentX(CENTER_ALIGNMENT); // centering things for cosmetic reasons
		box.add(label1);



		this.match.setAlignmentX(CENTER_ALIGNMENT);
		this.match.setSize(20, 1);
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


		frame1.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // setting defaults for secondary frame
		frame1.setSize(700, 700);
		frame1.setLayout(new BorderLayout());



		 String[] columnNames = {"First Name",
                 "Last Name",
                 "Sport",
                 "# of Years",
                 "Vegetarian",
                 "Test",
                 "test2",
                 "test3"}; // this may be breaking the code, but this is what the columnnames are for the JTable it prints to
		



		Object [][] data = {
			{newFrame1 = match.getText(), newFrame2 = team.getText(), newFrame3 = autoBall.getText(), newFrame4 = autoGear.getText(),
					newFrame5 = teleBalls.getText(), newFrame6 = teleGears.getText(), newFrame7 = climb.getText(), 
					newFrame8 = errors.getText()
			}};

			JTable table = new JTable(data, columnNames); // making new table
			table.setVisible(true);  //setting table visible
			frame1.add(table); // adding table to frame

			frame1.setVisible(true); // setting frame visible









	}
}