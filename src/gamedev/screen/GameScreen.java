package gamedev.screen;

import gamedev.entity.ImageResource;
import gamedev.entity.Level;
import gamedev.td.GameFrame;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.List;

public class GameScreen extends Screen {

	List<ImageResource> images;
	
	public static int sizeX = 16, sizeY = 12;
			
	int currentLevel;
	
	public GameScreen(int screenWidth, int screenHeight, GameFrame gameFrame, List<ImageResource> images) {
		super(screenWidth, screenHeight, gameFrame);
		this.images = images;
	}

	@Override
	public void render(Graphics2D gd) {
		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				if(getImage(Level.grid[i][j]) != null)
					gd.drawImage(getImage(Level.grid[i][j]), i*40, j*40, null);
				
			}
		}
	}

	@Override
	public void update(long time) {

	}

	@Override
	public void input(int mouseX, int mouseY) {

	}
	
	private BufferedImage getImage(int i) {
		for (ImageResource img : images) {
			if(img.getCorrespondingNumber() == i)
				return img.getImage();
		}
		return null;
	}
	
	private BufferedImage getImage(String imageName) {
		for (ImageResource img : images) {
			if(img.getImageName().equals(imageName))
				return img.getImage();
		}
		return null;
	}
	
	public void setLevel(int level) {
		currentLevel = level;
		prepareLevel(level+"");
	}
	
	private void prepareLevel(String level) {
		Level.readLevel(level);
	}

}
