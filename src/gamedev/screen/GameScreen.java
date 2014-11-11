package gamedev.screen;

import gamedev.entity.ImageResource;
import gamedev.entity.Level;
import gamedev.td.GameFrame;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.golden.gamedev.object.Timer;

public class GameScreen extends Screen {

	List<ImageResource> images;
	
	public static int sizeX = 16, sizeY = 12;
	
	int currentLevel, timeInSec;
	Timer timer;
	
	public GameScreen(int screenWidth, int screenHeight, GameFrame gameFrame, List<ImageResource> images) {
		super(screenWidth, screenHeight, gameFrame);
		this.images = images;
	}
	
	@Override
	public void initialize() {
		timer = new Timer(1000); // 1 sec
		timeInSec = 0;
	}

	@Override
	public void render(Graphics2D gd) {
		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				if(getImage(Level.grid[i][j]) != null)
					gd.drawImage(getImage(Level.grid[i][j]), i*40, j*40, null);
			}
		}
		
		gd.drawImage(getImage("ui"), 0, 480, null);
		
		// Sample
		gd.drawImage(getImage("egg"), 40, 520, null);
		gd.drawImage(getImage("corrupted_egg"), 40*2 + 2, 520, null);
		
	}

	@Override
	public void update(long time) {
		// If elapsed time reached 1 sec
		if(timer.action(time)) {
			timeInSec++;
			System.out.println(timeInSec);
		}
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
	
	// Call every time the player finishes a level
	private void saveData() {
		File file = new File("data.dat");
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			/*
			 * TODO: Save the progress of the player
			 * 	- Cleared levels, their scores and clear time 
			 *  - Ano pa ba?
			 */
			
			/*
			 * for each cleared level
			 * 		out.writeInt(score);
			 * 		out.writeLong(clearTimeInSeconds);
			 * 
			 */
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	

}
