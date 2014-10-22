package tileMap;

import java.awt.image.BufferedImage;

public class Tile {
	private boolean walkable;
	private int height;
	private int width;
	private BufferedImage tile;
	
	public Tile(int h,int w, String positionInTileset, BufferedImage tileset){
		this.height = h;
		this.width = w;
		
		String firstChar = positionInTileset.substring(0, 1);
		int otherChars = Integer.parseInt(positionInTileset.substring(1, positionInTileset.length()));
		switch (firstChar) {
			case "a":  	this.walkable = true;
						this.tile = tileset.getSubimage(otherChars, height, width, height);
                   		break;
         	case "b":  	this.walkable = false;
         				this.tile = tileset.getSubimage(otherChars, height*2, width, height);
         				break;
		}
		
	}
	
	public BufferedImage getTile(){
		return tile;
	}
	
	public boolean getWalkable(){
		return walkable;
	}
}
