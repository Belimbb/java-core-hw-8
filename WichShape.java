package hw8;

public enum WichShape {
    CIRCLE ("Circle"),
    QUAD ("Quad"),
    TRIANGLE ("Triangle"),
    RECTANGLE ("Rectangle"),
    RHOMBUS ("Rhombus");
    private final String shape;

    WichShape(String shape) {
        this.shape = shape;
    }

    public String getShape(){
        return shape;
    }
}
