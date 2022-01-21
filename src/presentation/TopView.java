package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JPanel;

import business.Brick;

public class TopView extends BrickView{
	
	public TopView()
	{
		
		Dimension d = new Dimension();
		d.setSize(150, 150);
        this.setPreferredSize(d);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawString("Top View" , 0, 10);
		
		Graphics2D gc = (Graphics2D) g;
		Rectangle2D.Double rectangle = new 
			Rectangle2D.Double(0,20.0, model.getWidth(), model.getLength());
		gc.setColor(Color.RED);
		gc.fill(rectangle);
		
	}

	
}
