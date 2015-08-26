package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 12..
 */
public class Figure {
    private int centerX;
    private int centerY;

    public Figure(int _centerX, int _centerY) {
        centerX = _centerX;
        centerY = _centerY;
    }

    protected double calcArea() {
        return 0.0;
    }

    protected void printFigure() {
        System.out.println("(" + centerX + ", " + centerY + ")");
    }

    protected void moveFigure(int _x, int _y){
        centerX += _x;
        centerY += _y;
    }
}
