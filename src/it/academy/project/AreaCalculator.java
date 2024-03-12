package it.academy.project;

public class AreaCalculator {
    private static void initiateContact() {
        InputOutputMngr.userShapeOptions();
        try {
            InputOutputMngr.userParamsOptions();
        } catch (UnknownShapeException e) {
            throw new RuntimeException(e);
        }
    }
    private static void returnOutPut() throws UnknownShapeException {
        int shape = InputOutputMngr.getShape();
        double area = 0.0;
        switch (shape) {
            case 1:
                Square  square = new Square(InputOutputMngr.getData1());
                square.calculate();
                area = square.getArea();
                break;
            case 2:
                Triangle triangle = new Triangle(InputOutputMngr.getData1(), InputOutputMngr.getData2());
                triangle.calculate();
                area = triangle.getArea();
                break;
            case 3:
                Circle circle = new Circle(InputOutputMngr.getData1());
                circle.calculate();
                area = circle.getArea();
                break;
            default:
                throw new UnknownShapeException("Invalid shape");
        }
        String output = "The area of the selected shape is: " + area;
        InputOutputMngr.displayCalcArea(output);
    }
    public static void calculate() throws UnknownShapeException {
        initiateContact();
        returnOutPut();
    }
    public static void main(String[] args) throws UnknownShapeException {
        calculate();
    }
}
