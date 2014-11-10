package gamedev.entity;

import java.awt.image.BufferedImage;

import com.golden.gamedev.object.Sprite;

public abstract class Tower extends Sprite{
	
	protected int price, attack;
	protected float attackRate; //attacks per second
	protected String name, attackType; //elements i.e. fire, water, etc.
	
	public Tower(double x, double y, BufferedImage image){
		super(image, x, y);
	}
	
	abstract public void attack(Enemy e);
	
	
	/*
	 * getters and setters
	 */
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public float getAttackRate() {
		return attackRate;
	}
	public void setAttackRate(float attackRate) {
		this.attackRate = attackRate;
	}
	public String getAttackType() {
		return attackType;
	}
	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
