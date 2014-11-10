package gamedev.td;

import java.awt.Dimension;

import com.golden.gamedev.GameLoader;


public class TowerDefense {

	public static GameFrame gameFrame = new GameFrame();
	public static GameLoader game = new GameLoader();
	
	public static void main(String[] args) {
		game.setup(gameFrame, new Dimension(640, 640), false);
		game.start();
	}

}
