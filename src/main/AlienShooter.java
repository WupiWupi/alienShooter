package main;

import controller.GameController;
import tileMap.TileMap;



public class AlienShooter {
	public static void main(String [] args){
		new GameController();
	}


	public static void test(){
		TileMap tm = new TileMap(30, "/tilesets/basic2.png", "/maps/level1_1.txt");
		
		for(int i = 0; i < tm.getMap().length; i++){
			for(int j = 0; j < tm.getMap()[i].length; j++){
				System.out.print(" "+tm.getMap()[i][j]);
			}
			System.out.println(); 
		}
		System.out.println(); 
		System.out.print(tm.getTiles()[0][0].getTileType()+" ");
		System.out.println(tm.getTiles()[0][1].getTileType());
		System.out.print(tm.getTiles()[1][0].getTileType()+" ");
		System.out.println(tm.getTiles()[1][1].getTileType());
		System.out.println(); 
		System.out.println("Width: "+tm.getMapWidth());
		System.out.println("Height: "+tm.getMapHeight());
	}
}