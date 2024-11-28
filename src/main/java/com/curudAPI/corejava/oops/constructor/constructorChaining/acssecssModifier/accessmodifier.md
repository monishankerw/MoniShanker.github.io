package org.example.corejava.oops.constructor.constructorChaining.acssecssModifier;
//Point main class access same package so protected it can be accessed in order class of the same package.
public class Point {
protected int x,y;
public Point(int _x,int _y){
x=_x;
y=_y;
}//java does not support default argument
public static class Main{
public static void main(String[] args) {
Point p=new Point();//default constructor
System.out.println("x="+p.x+","+"y="+p.y);
}
}
}


