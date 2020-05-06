import java.awt.geom.Point2D;

public class Vector extends Point2D.Double {

    public static final Vector i = new Vector(1.0, 0.0);
    public static final Vector j = new Vector(0.0, 1.0);

    public Vector() {
        super();
    }

    public Vector(double x, double y) {
        super(x, y);
    }

    public Vector normalize() {
        double length = this.getLength();

        if (length == 0) {
            return i;
        }

        return new Vector(this.getX() / length, this.getY() / length);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
    }

    public Vector add(Vector vector) {
        return new Vector(vector.getX() + this.x, vector.getY() + this.y);
    }

    public Vector subtract(Vector vector) {
        return new Vector(this.x - vector.getX(), this.y - vector.getY());
    }

    public Vector multiply(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    public Vector clone() {
        return new Vector(this.x, this.y);
    }
}