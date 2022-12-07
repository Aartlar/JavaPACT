public class P3_Circle {
    private double radius;

    public P3_Circle() {
        this(1.0);
    }

    public P3_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        return Math.PI * (radius * 2);
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}
