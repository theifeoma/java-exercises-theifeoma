package main.java.com.cbfacademy.shapes;

public class Cylinder extends Shape{

    private double radius;
    private double height;
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
        this.shapeName = "Cylinder";
    }
    public double area() {
        return (height * Math.PI * (Math.pow(radius, 2)));
    }
}
