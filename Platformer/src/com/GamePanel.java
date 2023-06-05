package com;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.inputs.KeyboardInputs;
import com.inputs.MouseInputs;

public class GamePanel extends JPanel {
	
	private int xDelta = 0;
	private int yDelta = 0;
	
	public GamePanel() {
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(new MouseInputs(this));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(xDelta, yDelta, 200, 50);
		g.setColor(Color.BLUE);
		
	}
	
	public void changeXDelta(int value) {
		this.xDelta+=value;
		repaint();
	}
	
	public void changeYDelta(int value) {
		this.yDelta+=value;
		repaint();
	}
	
	public void setRecPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}
	
}
