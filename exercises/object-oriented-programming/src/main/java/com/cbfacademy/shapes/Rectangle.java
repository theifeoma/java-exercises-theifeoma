package main.java.com.cbfacademy.shapes;

import org.w3c.dom.UserDataHandler;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
        this.shapeName = "Rectangle";
    }
    public double area() {
        return (length * width);
    }
}
