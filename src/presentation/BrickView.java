package presentation;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import business.Brick;

public abstract class BrickView extends JComponent implements Observer{
	
	protected Brick model;
	
	
	public void update(Observable observable, Object arg)
	{
		this.model = (Brick) observable;
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
}
