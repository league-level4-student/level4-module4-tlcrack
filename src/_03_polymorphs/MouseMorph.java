package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class MouseMorph extends Polymorph{

	MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

}
