package hw8;

public class Shape {
    WichShape shape;
    String res;

    public Shape() {
    }

    public Shape(WichShape shape) {
        this.shape = shape;
    }

    public String getShape(){
        switch (shape){
            case CIRCLE -> {
                return res = Circle.getName();
            }
            case QUAD -> {
                return res = Quad.getName();
            }
            case TRIANGLE -> {
                return res = Triangle.getName();
            }
            case RECTANGLE -> {
                return res = Rectangle.getName();
            }
            case RHOMBUS -> {
                return res =Rhombus.getName();
            }
        }
        return null;
    }
}
