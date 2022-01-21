package presentation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import business.Brick;

public class ControlPanel extends JPanel{
	
	private Brick model; // changes the brick
	private BrickController bc;
	private JTextField height;
	private JTextField width;
	private JTextField length;
	private JLabel heightL;
	private JLabel widthL;
	private JLabel lengthL;
	
	public ControlPanel(Brick model)
	{
		this.model = model;
		bc = new BrickController();
		this.setLayout(new GridLayout (3,2)); // rows, columns
		
		height = new JTextField("" , 10);
		width = new JTextField("" , 10);
		length = new JTextField("" , 10);
		
		heightL = new JLabel("Set Height");
		widthL = new JLabel("Set Width");
		lengthL = new JLabel("Set Length");
		
		height.addActionListener(bc);
		width.addActionListener(bc);
		length.addActionListener(bc);
		
		
		
		JPanel p = new JPanel();
		p.add(heightL);
		this.add(p);
		
		p = new JPanel();
		p.add(height);
		this.add(p);
		
		p = new JPanel();
		p.add(widthL);
		this.add(p);
		
		p = new JPanel();
		p.add(width);
		this.add(p);
		
		p = new JPanel();
		p.add(lengthL);
		this.add(p);
		
		p = new JPanel();
		p.add(length);
		this.add(p);
		
		
	}
	
	public class BrickController implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e) {
	
			JFrame f = new JFrame();
			
			if( e.getSource() == height);
			{
				try {
					Double h = Double.valueOf(height.getText());
					model.setHeight(h);  //model in this class is a brick object. It was casted as a brick object in BrickView
					//model in this class just follows this idea, thats why it is called brick .
				}
				catch(NumberFormatException e1)
				{
					System.err.println(e1.getMessage());
					JOptionPane.showMessageDialog(f,"Dimensions must be numeric", "OOPS!" ,JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception err)
				{
					System.err.println(err.getMessage());
					JOptionPane.showMessageDialog(f,err.getMessage(), "OOPS!" ,JOptionPane.ERROR_MESSAGE);
				}
			}
			
			if( e.getSource() == length);
			{
				try {
					Double h = Double.valueOf(length.getText());
					model.setLength(h);
				}
				catch(NumberFormatException e1)
				{
					System.err.println(e1.getMessage());
					JOptionPane.showMessageDialog(f,"Dimensions must be numeric", "OOPS!" ,JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception err)
				{
					System.err.println(err.getMessage());
					JOptionPane.showMessageDialog(f,err.getMessage(), "OOPS!" ,JOptionPane.ERROR_MESSAGE);
				}
			}
			
			if( e.getSource() == width);
			{
				try {
					Double h = Double.valueOf(width.getText());
					model.setWidth(h);
				}
				catch(NumberFormatException e1)
				{
					System.err.println(e1.getMessage());
					JOptionPane.showMessageDialog(f,"Dimensions must be numeric", "OOPS!" ,JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception err)
				{
					System.err.println(err.getMessage());
					JOptionPane.showMessageDialog(f,err.getMessage(), "OOPS!" ,JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}
		
	}
}

