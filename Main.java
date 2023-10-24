package hw8;

public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        Shape shape = shapePrinter.ShapeName();
        shapePrinter.printShape(shape);
    }
}
