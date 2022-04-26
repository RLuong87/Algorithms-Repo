public class Rectangle {

    public float height;
    public float width;
    //8 bytes for doubles,4 bytes for floats
    //8 bits, 01001001 -- one bit 0 OR 1
    //byte = 127, short, int, long

    //constructor
    Rectangle ( float height, float width ) {
        this.height = height;
        this.width = width;
    }

    public float getArea() {
//        return this.width * this.height; //still valid
        return width * height;
    }

    public float getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        String data = "This rectangle has a height of " + height + " and a width of " + width;
        String perimeterAndArea = " It's perimeter is " + getPerimeter() + " and its area is " + getArea();
        return data + perimeterAndArea;

    }
}
