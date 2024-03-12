package it.academy.project;

public abstract class Shape {
    private double area;
    private double sideOne;
    private double sideTwo;

    public Shape(double side1, double side2) {
        this.sideOne = side1;
        this.sideTwo = side2;
    }
    public abstract void calculate();

    public void retangleArea() {
        this.area = this.sideOne * this.sideTwo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "Area of shape is" + area + "cm3";
    }

}
