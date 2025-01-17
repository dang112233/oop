package hus.oop.lab6.circle;

public class Circle {
    private  double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String Color) {
        this.color = Color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius = " + this.radius + ", color = " + this.color + "]";
    }
}
