package fr.iutvalence.info.dut.m3105.preamble;

import com.sun.prism.paint.Color;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape s = new BorderShapeDecorator(2, new ShadowShapeDecorator(90,5,new SolidFillShapeDecorator(Color.BLACK, new Circle(3))));
		s.draw(new Position(0,1));
	}

}
