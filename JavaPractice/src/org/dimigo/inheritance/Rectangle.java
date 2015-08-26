package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int _width, int _height) {
        super(0, 0);
        width = _width;
        height = _height;
    }

    public Rectangle(int _centerX, int _centerY, int _width, int _height) {
        super(_centerX, _centerY);
        width = _width;
        height = _height;
    }

    @Override
    protected double calcArea() {
        return width*height;
    }

    @Override
    protected void printFigure() {
        System.out.println("사각형 ");
        super.printFigure();
    }
}
