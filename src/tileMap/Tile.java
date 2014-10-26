package tileMap;

import java.awt.image.BufferedImage;

public class Tile {
	private BufferedImage tileImg;
	private int type;

	public Tile(BufferedImage tileImg, int type){
		this.tileImg = tileImg;
		this.type = type;
	}

	public BufferedImage getTileImg(){
		return this.tileImg;
	}

	public int getTileType(){
		return this.type;
	}
}
