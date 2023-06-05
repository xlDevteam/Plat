package com;

public class Game implements Runnable {
		
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	private Thread gameThread;
	private final int FPS = 120;
	

	public Game() {
		gamePanel = new GamePanel();
		gameWindow = new GameWindow(gamePanel);
		startGameLoop();
		gamePanel.setFocusable(true);
		gamePanel.requestFocus();
	}
	
	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		
		double timePerFrame = 1000000000 / FPS;
		long lastFrame = System.nanoTime();
		long now = System.nanoTime();
		
		int frames = 0;
		long lastCheck = System.currentTimeMillis();
		
		while(true) {
			
			now = System.nanoTime();
			if(System.nanoTime() - lastFrame >= timePerFrame) {
				gamePanel.repaint();
				lastFrame = now;
				frames++;
			}
					
			if(System.currentTimeMillis() - lastCheck >= 1000) {
				lastCheck = System.currentTimeMillis();
				System.out.println("Fps: " + frames);
				frames = 0;
			}			
			
		}
		
	}

}
