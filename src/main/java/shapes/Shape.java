package shapes;

public abstract class Shape {
    protected int x, y;
    private String colour;

    private boolean visible;

    public Shape(int x, int y, String color, boolean visible) {
        this.x = x;
        this.y = y;
        setColor(color);
        setVisible(visible);
    }

    public String getColor() {
        return colour;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setColor(String color) {
        if (colour == null)
            this.colour = "white";
        else
            this.colour = color;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", colour='" + colour + '\'' +
                ", visible=" + visible +
                '}';
    }
}
