package org.example.corejava.oops.constructor.constructorChaining.acssecssModifier;

public class Point {
    protected int x, y;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public static class Main {
        public static void main(String[] args) {
            Point p = new Point();  // Uses the default constructor
            System.out.println("x=" + p.x + ", y=" + p.y);
        }
    }

}
