public class Cylinder extends Shape{

    double height;
    double radius;

    public Cylinder(double a, double b) {
        super("Cylinder");
        height=a;
        radius=b;
    }

    public double area() {
        return (radius*radius*height*Math.PI);
    }

    @Override
    public String toString() {
        return super.toString()+" of radius "+radius+" and height "+height;
    }
}
