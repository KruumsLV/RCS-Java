package rcs.examples.classes;

public abstract class Shape {
    public String color;

    abstract public double area();
    abstract public double perimeter();

    public void show() {
        System.out.println("Shape showed!");
    }
}
