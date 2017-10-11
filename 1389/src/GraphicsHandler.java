import javax.swing.*;


import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsHandler extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String match = JOptionPane.showInputDialog("Match");
	static String team = JOptionPane.showInputDialog("Team");
	static String autoball = JOptionPane.showInputDialog("Autonomous Balls?");
	static String autogear = JOptionPane.showInputDialog("Automous Gear?");
	static String teleball = JOptionPane.showInputDialog("Teleop Balls");
	static String telegear = JOptionPane.showInputDialog("Teleop Gear?");
	static String climbs = JOptionPane.showInputDialog("Climbed?");
	static String errors = JOptionPane.showInputDialog("Errors");

    private static final Object[][] rowData = {{match, team, autoball, autogear, teleball, telegear, climbs, errors}};
    private static final Object[] columnNames = {"Match", "Team", "Autonomous Balls", "Autonomous Gears", 
    		"Teleop Balls", "Teleop Gears", "Climb Success?", "Errors"};

  
    private JTable table;
    private DefaultTableModel model;

    public GraphicsHandler() {
         Container c = getContentPane();
         c.setLayout(new BorderLayout());

         model = new DefaultTableModel(rowData, columnNames);
         table = new JTable();
         table.setModel(model);
         c.add(new JScrollPane(table), BorderLayout.CENTER);
         JButton add = new JButton("Add");
         c.add(add, BorderLayout.SOUTH);
         add.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
            	
            	 Object [][] rowData = {{}};
            	 
            		String match = JOptionPane.showInputDialog("Match");
            		String team = JOptionPane.showInputDialog("Team");
            		String autoball = JOptionPane.showInputDialog("Autonomous Balls?");
            		String autogear = JOptionPane.showInputDialog("Automous Gear?");
            		String teleball = JOptionPane.showInputDialog("Teleop Balls");
            		String telegear = JOptionPane.showInputDialog("Teleop Gear?");
            		String climbs = JOptionPane.showInputDialog("Climbed?");
            		String errors = JOptionPane.showInputDialog("Errors");
            		
            	Object [][] rowData1 = {{match, team, autoball, autogear, teleball, telegear, climbs, errors}};
           
             	model.addRow(rowData1[0]); 
             } 
         });
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         pack(); 
    }

    public static void main(String[] args) {
        GraphicsHandler g = new GraphicsHandler();
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }
}