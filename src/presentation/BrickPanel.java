package presentation;


import java.awt.GridLayout;

import javax.swing.JPanel;

import business.Brick;
import framework.Model;

public class BrickPanel extends JPanel {
	
	private Brick model;
	
	public BrickPanel(Brick model) 
	{
		this.model = model;
		this.setLayout(new GridLayout(2, 2));
     
		JPanel p = new JPanel();
		ControlPanel control = new ControlPanel(model);
     	p.add(control);
     	this.add(p);
     	
     	
     	p = new JPanel();
     	SideView sideView = new SideView();
     	p.add(sideView);
     	this.add(p);
     	model.addObserver(sideView);
     	
     	p = new JPanel();
     	TopView topView = new TopView();
     	p.add(topView);
     	this.add(p);
     	model.addObserver(topView);
     	
     	p = new JPanel();
     	FrontView frontView = new FrontView();
     	p.add(frontView);
     	this.add(p);
     	model.addObserver(frontView);
     	
     	
     	
     	this.model.changed();
     
	}
}
