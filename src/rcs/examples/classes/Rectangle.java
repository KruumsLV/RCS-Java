package rcs.examples.classes;

public class Rectangle extends Shape {
    int length, width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return (double)length*width;
    }

    @Override
    public double perimeter() {
        return (double)(length+width)*2;
    }

    @Override
    public void show() {
        System.out.println("Rectangle showed!");
    }
}
