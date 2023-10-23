package hw8_attempt2;

import java.util.Scanner;

public class ShapePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hw8_attempt2.WichShape shape = null;

        do {
            System.out.print("Input a shape: ");
            String in = scanner.nextLine();

            try {
                shape = WichShape.valueOf(in.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("You wrote incorrect shape. Please try again.");
            }
        } while (shape == null);
        Shape form = new Shape(shape);
        System.out.println(form.getShape());
        scanner.close();
    }
}
