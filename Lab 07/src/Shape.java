public abstract class Shape {
    private String shapeName;
    public abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return shapeName;
    }
}
