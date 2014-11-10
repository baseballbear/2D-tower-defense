package gamedev.screen;

import gamedev.td.GameFrame;

import java.awt.Graphics2D;

public class MainMenuScreen extends Screen {

	public MainMenuScreen(int screenWidth, int screenHeight, GameFrame gameFrame) {
		super(screenWidth, screenHeight, gameFrame);
		
	}

	@Override
	public void render(Graphics2D gd) {
		for (Button button : buttonList) {
			button.render(gd);
		}
	}

	@Override
	public void input(int mouseX, int mouseY) {
		
	}

	@Override
	public void update(long time) {
		
	}

}
