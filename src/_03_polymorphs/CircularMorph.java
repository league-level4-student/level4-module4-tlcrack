package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircularMorph extends Polymorph{
	float counter = 0;
	CircularMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}

	public void update(){
		double newX = 50*Math.cos(counter);
		double newY = 50*Math.sin(counter);
		this.x+=newX;
		this.y+=newY;
		counter++;
	}
	
}
