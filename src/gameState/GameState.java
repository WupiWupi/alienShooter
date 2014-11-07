package gameState;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Menu;

import javax.swing.JPanel;


public class GameState extends JPanel {
	
	//dimensions
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	public static final int SCALE = 2;  //-> 640x480
	
	
	public GameState(){
		super();
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setFocusable(true);
		requestFocus();
	}

	public void draw(Graphics2D g, MenuState ms) {
		g.drawImage(ms.getBackground(), 0, 0, null);
	}
	
}
