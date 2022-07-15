public class Circle {
    private static double radius;
    private static final double PI = 3.14;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

     static double getArea () {
        return PI*(radius*radius);
    }

     static double getCircumference() {
        return 2*PI*radius;
    }

}
