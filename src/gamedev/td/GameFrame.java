package gamedev.td;
import gamedev.entity.ImageResource;
import gamedev.screen.GameOverScreen;
import gamedev.screen.GameScreen;
import gamedev.screen.LevelSelectScreen;
import gamedev.screen.MainMenuScreen;
import gamedev.screen.Screen;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import com.golden.gamedev.Game;


public class GameFrame extends Game {
	
	// Screens
	Screen currentScreen;
	MainMenuScreen mainMenu;
	LevelSelectScreen levelSelect;
	GameOverScreen gameOverScreen;
	GameScreen gameScreen;
	
	@Override
	public void initResources() {
		mainMenu = new MainMenuScreen(this.getWidth(), this.getHeight(), this);
		levelSelect = new LevelSelectScreen(this.getWidth(), this.getHeight(), this);
		gameOverScreen = new GameOverScreen(this.getWidth(), this.getHeight(), this);
		
		gameScreen = new GameScreen(this.getWidth(), this.getHeight(), this, initGameImages());
		
		currentScreen = gameScreen;
		gameScreen.setLevel(1);
	}
	
	private List<ImageResource> initGameImages() {
		List<ImageResource> gameImages = new ArrayList<>();
		
		gameImages.add(new ImageResource(getImage("img/grass.png"), "grass", 0));
		gameImages.add(new ImageResource(getImage("img/dirt_light.png"), "dirt_light", 1));
		gameImages.add(new ImageResource(getImage("img/dirt_dark.png"), "dirt_dark", 2));
		gameImages.add(new ImageResource(getImage("img/tower.png"), "tower", 3));
		
		
		return gameImages;
	}
	
	@Override
	public void render(Graphics2D gd) {
		currentScreen.render(gd);
	}

	@Override
	public void update(long time) {
		
	}
	
	public void getInput() {
		if(currentScreen instanceof MainMenuScreen) {
			/*
			 * eg. if(click()) {
			 * 		etc.
			 * }
			 */
		}
		else if(currentScreen instanceof LevelSelectScreen) {
			
		}
		else if(currentScreen instanceof GameOverScreen) {
			
		}
	}

}
