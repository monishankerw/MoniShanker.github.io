package org.example.corejava.oops.constructor.constructorChaining.acssecssModifier;

public class Point1 {
protected int x, y;

    // Parameterized constructor
    public Point1(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public static class Main {
        public static void main(String[] args) {
            Point1 p = new Point1(0, 0);  // Calls the parameterized constructor
            System.out.println("x=" + p.x + ", y=" + p.y);
        }
    }
}