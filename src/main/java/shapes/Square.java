package shapes;

public class Square extends Shape {

    private int length;

    public Square(int x, int y, String color, boolean visible, int length) {
        super(x, y, color, visible);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0)
            this.length = 10;
        else
            this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
