package it.academy.project;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {

    public Circle(double side) {
        super(side, side);
    }

    @Override
    public void calculate() {
        super.retangleArea();
        double circleArea = Math.PI * super.getArea();
        BigDecimal area = new BigDecimal(circleArea);
        area = area.setScale(2, RoundingMode.UP);
        super.setArea(area.doubleValue());
    }
}
