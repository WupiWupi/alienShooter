package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import tileMap.Tile;

public class AlienShooter {
	public static void main(String [] args){
		BufferedImage img = null;
		try {
			img = ImageIO.read((new File("../resources/tilesets/basic.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Tile tile = new Tile(30, 30, "a1",img);
	}
}
