package gamedev.entity;

import java.awt.image.BufferedImage;

import com.golden.gamedev.object.Sprite;

public abstract class Enemy extends Sprite {
	private static final long serialVersionUID = 1L;
	
	private int health, speed;
	
	public Enemy(double x, double y, BufferedImage image){
		super(image, x, y);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
