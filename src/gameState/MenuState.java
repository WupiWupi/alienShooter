package gameState;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MenuState {
	
	private BufferedImage bg;
	
	public MenuState(){
		try {
			
			bg = ImageIO.read(getClass().getResourceAsStream("/backgrounds/menubg.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage getBackground(){
		return bg;
	}
	
}
