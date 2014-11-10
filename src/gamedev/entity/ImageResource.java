package gamedev.entity;

import java.awt.image.BufferedImage;

public class ImageResource {
	private BufferedImage image;
	private String imageName;
	private int correspondingNumber;
	
	public ImageResource(BufferedImage image, String imageName, int correspondingNumber) {
		this.image = image;
		this.imageName = imageName;
		this.correspondingNumber = correspondingNumber;
	}

	public BufferedImage getImage() {
		return image;
	}

	public String getImageName() {
		return imageName;
	}

	public int getCorrespondingNumber() {
		return correspondingNumber;
	}
	
}
