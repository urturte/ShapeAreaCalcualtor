package it.academy.project;
import java.util.Scanner;

public class InputOutputMngr {
    private static int shape;
    private static double data1;
    private static double data2;

    public static int getShape() {
        return shape;
    }

    public static double getData1() {
        return data1;
    }

    public static double getData2() {
        return data2;
    }
    static final Scanner userInput = new Scanner(System.in);
    public static void userShapeOptions() {
        System.out.println("Choose shape ((1 for square, 2 for triangle, 3 for circle))");
        shape = userInput.nextInt();
    }
    public static void userParamsOptions() throws UnknownShapeException {
        if(shape == 1) {
            System.out.println("Enter length of the edge:");
            data1 = userInput.nextDouble();
        } else if (shape==2) {
            System.out.println("Enter 2 parameters for the two edges of the triangle:");
            data1 = userInput.nextDouble();
            data2 = userInput.nextDouble();
        } else if (shape == 3) {
            System.out.println("Enter the radius of the circle:");
            data1 = userInput.nextDouble();
        } else {
            userInput.close();
            throw new UnknownShapeException("Enter a valid option");
        }
        userInput.close();
    }
    public static void displayCalcArea(String calcArea) {
        System.out.println(calcArea);
    }
}
