package tileMap;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class TileMap {
	
	//tiles
	private int tileSize;
	private int tileSetCols;
	private int tileSetRows;
	private Tile[][] tiles;
	
	//map
	private String[][] map;
	private int mapCols;
	private int mapRows;
	private int mapHeight;
	private int mapWidth;
	
	public TileMap(int tileSize, String tileSetPath, String mapPath){
		this.tileSize = tileSize;
		loadTileSet(tileSetPath);
		loadMap(mapPath);
	}
	
	
	private void loadTileSet(String tileSetPath){
		BufferedImage tileSet = null;
		try {
			 tileSet = ImageIO.read(getClass().getResourceAsStream(tileSetPath));
			 tileSet.getWidth();
			 this.tileSetCols = tileSet.getWidth() / tileSize; 
			 this.tileSetRows = tileSet.getHeight() / tileSize;
			 this.tiles = new Tile[tileSetRows][tileSetCols];
			 
			 BufferedImage tileImg;
			 
			 for (int currentRow = 0; currentRow < tileSetRows; currentRow++){
				 for (int currentCol = 0; currentCol < tileSetCols; currentCol++){
					 tileImg = tileSet.getSubimage(currentCol*tileSize, currentRow*tileSize, tileSize, tileSize);
					 tiles[currentRow][currentCol] = new Tile(tileImg,currentRow);
				 }
			 }

			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private void loadMap(String mapPath){
		try{
			
			InputStream in = getClass().getResourceAsStream(mapPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			mapCols = Integer.parseInt(br.readLine());
			mapRows = Integer.parseInt(br.readLine());
			map = new String[mapRows][mapCols];
			mapWidth = mapCols * tileSize;
			mapHeight = mapRows * tileSize;
			
			for(int currentRow = 0; currentRow < mapRows; currentRow++){
				String line = br.readLine();
				String[] lineSplit = line.split(" ");
				for(int currentCol = 0; currentCol < mapCols; currentCol++){
					map[currentRow][currentCol] = lineSplit[currentCol];
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Tile[][] getTiles() {
		return tiles;
	}

	public String[][] getMap() {
		return map;
	}

	public int getMapHeight() {
		return mapHeight;
	}

	public int getMapWidth() {
		return mapWidth;
	}
}
