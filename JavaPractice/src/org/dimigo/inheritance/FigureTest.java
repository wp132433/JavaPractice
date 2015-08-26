package org.dimigo.inheritance;

/**
 * Created by WOF on 15. 8. 13..
 */
public class FigureTest {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(10, 10, 5, 8);
        Rectangle r = new Rectangle(20, 20, 5 ,8);

        System.out.println(c.calcArea()+"");
        System.out.println(t.calcArea()+"");
        System.out.println(r.calcArea() + "");

        c.printFigure();
        t.printFigure();
        r.printFigure();

        c.moveFigure(5, 5);
        t.moveFigure(5, 5);
        r.moveFigure(5, 5);

        c.printFigure();
        t.printFigure();
        r.printFigure();
    }
}
