public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double a,double b) {
        super("Rectangle");
        length=a;
        width=b;
    }
    public double area()
    {
        return length*width;
    }

    public String toString() {
        return super.toString()+" of width "+width+" and length "+length;
    }
}
