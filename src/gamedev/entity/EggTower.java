package gamedev.entity;

import java.awt.image.BufferedImage;

public class EggTower extends Tower {
	private static final long serialVersionUID = 1L;

	
	public EggTower(double x, double y, BufferedImage image) {
		super(x, y, image);
	}

	@Override
	public void attack(Enemy e) {
		
	}

	@Override
	public void upgrade() {
		
	}

}
