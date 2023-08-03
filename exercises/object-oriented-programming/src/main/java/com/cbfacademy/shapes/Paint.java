package main.java.com.cbfacademy.shapes;

public class Paint {
    private double coverage;

    public Paint()
    {
        this.coverage = 8.0;
    }

    public double amount(Shape shape)
    {
        double area = shape.area();
        double shapeAmount = area * coverage;
        return shapeAmount;
    }
}
