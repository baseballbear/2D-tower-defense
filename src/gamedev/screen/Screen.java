package gamedev.screen;

import gamedev.td.GameFrame;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public abstract class Screen {
	
	GameFrame gameFrame;
	int screenWidth, screenHeight;
	List<Button> buttonList;

	public Screen(int screenWidth, int screenHeight, GameFrame gameFrame) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		buttonList = new ArrayList<>();
	}
	
	public abstract void initialize();
	public abstract void render(Graphics2D gd);
	public abstract void update(long time);
	public abstract void input(int mouseX, int mouseY);
	
	public void addButton(Button button) {
		buttonList.add(button);
	}
	
}
