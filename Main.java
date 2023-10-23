package hw8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        switch (shape) {
            case CIRCLE -> System.out.println(new Circle());
            case QUAD -> System.out.println(new Quad());
            case TRIANGLE -> System.out.println(new Triangle());
            case RECTANGLE -> System.out.println(new Rectangle());
            case RHOMBUS -> System.out.println(new Rhombus());
        }
        scanner.close();
    }
}
