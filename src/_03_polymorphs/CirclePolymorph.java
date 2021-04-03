package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
int circle =  0;
int cX = 0;
int cY = 0;
	CirclePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	
	}


	@Override
	public void update() {
	
		cX = (int) (x + 100*Math.cos(circle));
	
		cY = (int) (y + 100*Math.sin(circle));
		circle++;
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method 	 stub
		g.setColor(Color.RED);
		g.fillRect(cX, cY, WIDTH, HEIGHT);
	}

}