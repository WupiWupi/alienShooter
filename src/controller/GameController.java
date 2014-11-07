package controller;

import java.awt.Frame;
import java.awt.Graphics2D;

import gameState.GameState;
import gameState.MenuState;

import javax.swing.JFrame;

import tileMap.TileMap;

public class GameController {
	TileMap tm;
	GameState gs;
	MenuState ms;
	private Graphics2D g;
	
	public GameController() {
		createWindow();
		createMenuState();
	}
	
	private void createMenuState(){
		ms = new MenuState();
		gs.draw(g,ms);
		//tm = new TileMap(30, "/tilesets/basic2.png", "/maps/level1_1.txt");
	}
	
	private void createWindow(){
		gs = new GameState();
		JFrame window = new JFrame("Alien Shooter");
		window.setContentPane(gs);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
	}
	
	
	
}
