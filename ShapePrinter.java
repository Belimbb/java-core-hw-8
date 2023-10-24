package hw8;

import java.util.Scanner;

public class ShapePrinter {
    public Shape ShapeName() {
        Scanner scanner = new Scanner(System.in);
        WichShape shape = null;

        do {
            System.out.print("Input a shape: ");
            String in = scanner.nextLine();

            try {
                shape = WichShape.valueOf(in.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("You wrote incorrect shape. Please try again.");
            }
        } while (shape == null);
        scanner.close();
        return new Shape(shape);
    }

    public void printShape(Shape shape) {
        System.out.println("Name for entered shape is "+shape.getShape());
    }
}
