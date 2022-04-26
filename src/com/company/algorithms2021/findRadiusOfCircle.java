
public class Circle {

    public float radius;

    Circle (double radius) {
        this.radius = (float) radius;

    }

    public float getArea() {
        return 3.14F * radius * radius;
    }

    public float getPerimeter() {
        return 3.14F * radius * 2;
    }
}
