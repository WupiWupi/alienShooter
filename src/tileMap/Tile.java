package tileMap;

import java.awt.image.BufferedImage;

public class Tile {
	private boolean walkable;
	private int height;
	private int width;
	private BufferedImage image;
	
	public Tile(int height,int width, String element){
		this.height = height;
		this.width = width;
		
		String firstChar = element.substring(0, 1);
		 switch (firstChar) {
         	case "a":  	walkable = true;
                   		break;
         	case "b":  	walkable = false;
         				break;
		 }
		 
		 
	}
}
