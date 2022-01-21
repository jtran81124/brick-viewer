package presentation;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import business.*;
import framework.*;

public class BrickFrame extends JFrame {

	private Brick model;
	private BrickPanel brickPanel;


	public BrickFrame() {
		model = new Brick();
		brickPanel = new BrickPanel(model);
		Container cp = getContentPane();
		cp.add(brickPanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Brick CAD");
		setSize(300, 150);
		pack();
	}



	public static void main(String[] args) {
		BrickFrame brickFrame = new BrickFrame();
		brickFrame.setVisible(true);
	}



}