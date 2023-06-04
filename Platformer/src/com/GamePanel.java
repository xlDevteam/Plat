package com;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.inputs.KeyboardInputs;

public class GamePanel extends JPanel {
	
	public GamePanel() {
		addKeyListener(new KeyboardInputs());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(100, 100, 200, 50);
		g.setColor(Color.BLUE);
		
	}
	
}
