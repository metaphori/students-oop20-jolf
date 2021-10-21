package model;

import java.awt.Color;
import java.awt.Graphics;

public class Ice extends Surface {
	
	private static final double ICE_FRICTION = 0.05;
	private static final Color ICE_COLOR = new Color(137, 210, 220);
	
	public Ice(final Point2D position, final int width, final int height) {
		super(position, width, height, ICE_FRICTION);
	}

	@Override
	public void draw(final Graphics g) {
		g.setColor(ICE_COLOR);
		super.draw(g);
	}

	@Override
	public void applyConstraintTo(final Ball ball) {
	}

}
