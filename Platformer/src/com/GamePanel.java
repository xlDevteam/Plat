package com;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.inputs.KeyboardInputs;
import com.inputs.MouseInputs;

public class GamePanel extends JPanel {
	
	private float xDelta, yDelta = 0;
	private float xDir, yDir = .01f;
	
	private int frames = 0;
	private long lastCheck = 0;
	
	public GamePanel() {
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(new MouseInputs(this));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		updateRectangle();
		
		g.fillRect((int)xDelta,(int)yDelta, 200, 50);
		g.setColor(Color.BLUE);
		

	}
	
	private void updateRectangle() {
		xDelta +=xDir;
		if(xDelta > 400 || xDelta < 0) {
			xDir *=-1;
		}
		yDelta +=yDir;
		if(yDelta > 400 || yDelta < 0) {
			yDir *=-1;
		}
	}

	public void changeXDelta(int value) {
		this.xDelta+=value;
	}
	
	public void changeYDelta(int value) {
		this.yDelta+=value;
	}
	
	public void setRecPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
	}
	
}
