package oop.inheritance;

public class Triangle extends Shape{
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return 0.5*a*h;
    }

    @Override
    public void draw() {
        System.out.println("Burada bir ucbucaq sekli movcuddur");
    }
}
