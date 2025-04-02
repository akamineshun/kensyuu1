package chapter6.program1;

abstract class Polygon extends Shape {
    protected int angle;

    public Polygon(int angle) {
        this.angle = angle;
    }

    public int getInternalAngle() {
        return (angle - 2) * 180;
    }
}
