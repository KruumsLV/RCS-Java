package rcs.examples.classes;

public class Circle extends Shape {
    protected static final double PI = 3.14159265;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return (PI*radius*radius);
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }
}
