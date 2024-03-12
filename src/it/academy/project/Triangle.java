package it.academy.project;

public class Triangle extends Shape{

    public Triangle(double sideOne, double sideTwo) {
        super(sideOne, sideOne);

    }
    public void calculate() {
        super.retangleArea();
        double triangleArea = super.getArea()/2;
        super.setArea(triangleArea);
    }
}
