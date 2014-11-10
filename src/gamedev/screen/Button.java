package gamedev.screen;

import java.awt.image.BufferedImage;

import com.golden.gamedev.object.Sprite;

public class Button extends Sprite {
	private static final long serialVersionUID = 1L;
	
	String btnName;
	
	public Button(BufferedImage img, double x, double y, String btnName){
		super(img, x, y);
		this.btnName = btnName;
	}
	
	public boolean contains(int x, int y) {
		if(x >= getX() && y >= getY() && x <= getX() + getWidth() && y <= getY() + getHeight())
			return true;
		else
			return false;
	}

	public String getBtnName() {
		return btnName;
	}

}
