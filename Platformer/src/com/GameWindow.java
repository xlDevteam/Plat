package com;

import javax.swing.JFrame;

public class GameWindow {

	private JFrame gameWindow;
	
	public GameWindow(GamePanel gamePanel) {
		gameWindow = new JFrame();
		gameWindow.setSize(400, 400);
		gameWindow.setResizable(false);
		gameWindow.setAlwaysOnTop(true);
		gameWindow.setLocationRelativeTo(null);
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gameWindow.add(gamePanel);
		
		gameWindow.setVisible(true);
	}

}
